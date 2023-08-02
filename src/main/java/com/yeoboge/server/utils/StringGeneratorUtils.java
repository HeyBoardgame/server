package com.yeoboge.server.utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 랜덤 문자열을 생성하는 유틸 클래스
 */
public class StringGeneratorUtils {

    /**
     * 임시 비밀번호를 생성함
     *
     * @return 생성한 임시 비밀번호
     */
    public static String getTempPassword(){
        char[] charSet = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        String str = "";

        // 문자 배열 길이의 값을 랜덤으로 10개를 뽑아 구문을 작성함
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            idx = (int) (charSet.length * Math.random());
            str += charSet[idx];
        }
        return str;
    }

    /**
     * 사용자 간 친구 추가 시 사용되는 코드를 생성함.
     *
     * @return 친구 추가 용 코드
     */
    public static String generateUserCode() {
        final char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder stringBuilder = new StringBuilder();

        int seed = (int) (alphabets.length * Math.random());
        stringBuilder.append(alphabets[seed]);
        stringBuilder.append(RandomStringUtils.randomNumeric(5));

        return stringBuilder.toString();
    }
}