import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // 2차원 평면상의 점을 표현하는 Point 클래스
    private static class Point {
        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // 두 직선의 교차점을 찾는 메서드
    private Point intersection(long a, long b, long c, long d, long e, long f) {
        double x = (double) (b * f - e * d) / (a * d - b * c);
        double y = (double) (e * c - a * f) / (a * d - b * c);
        
        // 정수인지 확인하고, 정수라면 Point 객체를 생성하여 반환
        if (x % 1 != 0 || y % 1 != 0) return null;
        return new Point((long) x, (long) y);
    }

    // 주어진 직선들의 교차점을 찾아 '*'로 표시한 2차원 배열을 반환하는 메서드
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();  // 교차점을 저장할 리스트

        long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE, maxY = Long.MIN_VALUE;

        // 모든 직선 쌍에 대해 교차점을 찾음
        for (int i = 0; i < line.length; i++) {
            int a = line[i][0];
            int b = line[i][1];
            int e = line[i][2];
            for (int j = i + 1; j < line.length; j++) {
                int c = line[j][0];
                int d = line[j][1];
                int f = line[j][2];
                Point intersection = intersection(a, b, c, d, e, f);

                // 교차점이 존재하면 리스트에 추가하고, 최소/최대 값을 갱신
                if (intersection != null) {
                    points.add(intersection);
                    minX = Math.min(minX, (int) intersection.x);
                    minY = Math.min(minY, (int) intersection.y);
                    maxX = Math.max(maxX, (int) intersection.x);
                    maxY = Math.max(maxY, (int) intersection.y);
                }
            }
        }

        // 최소/최대 값을 이용해 2차원 배열의 크기를 계산
        int width = (int) (maxX - minX + 1);
        int height = (int) (maxY - minY + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');  // 배열을 '.'으로 초기화
        }

        // 교차점의 상대적인 위치에 '*' 표시
        for (Point p : points) {
            int x = (int) (p.x - minX);
            int y = (int) (maxY - p.y);
            arr[y][x] = '*';
        }

        // 결과를 String 배열로 변환
        String[] result = new String[height];
        for (int i = 0; i < height; i++) {
            result[i] = new String(arr[i]);
        }
        return result;
    }
}
