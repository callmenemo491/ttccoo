package p362uh;

/* renamed from: uh.h */
/* loaded from: classes.dex */
public class C6462h extends p362uh.C6461g {
    /* renamed from: E */
    public static final java.lang.Double m13048E(java.lang.String r3) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = 0
            uh.c r1 = p362uh.C6458d.f25048a     // Catch: java.lang.NumberFormatException -> L17
            boolean r1 = r1.m13043a(r3)     // Catch: java.lang.NumberFormatException -> L17
            if (r1 == 0) goto L17
            double r1 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L17
            java.lang.Double r3 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L17
            r0 = r3
        L17:
            return r0
    }

    /* renamed from: F */
    public static final java.lang.Integer m13049F(java.lang.String r11) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r11, r0)
            p214m2.C4339q.m9706k(r11, r0)
            r0 = 10
            gh.C2390b.m6112b(r0)
            int r1 = r11.length()
            r2 = 0
            if (r1 != 0) goto L15
            goto L6d
        L15:
            r3 = 0
            char r4 = r11.charAt(r3)
            r5 = 48
            int r5 = p214m2.C4339q.m9708m(r4, r5)
            r6 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r7 = 1
            if (r5 >= 0) goto L37
            if (r1 != r7) goto L29
            goto L6d
        L29:
            r5 = 45
            if (r4 != r5) goto L31
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            goto L39
        L31:
            r5 = 43
            if (r4 != r5) goto L6d
            r4 = 1
            goto L38
        L37:
            r4 = 0
        L38:
            r7 = 0
        L39:
            r5 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r8 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L3f:
            if (r4 >= r1) goto L60
            char r9 = r11.charAt(r4)
            int r9 = java.lang.Character.digit(r9, r0)
            if (r9 >= 0) goto L4c
            goto L6d
        L4c:
            if (r3 >= r8) goto L55
            if (r8 != r5) goto L6d
            int r8 = r6 / 10
            if (r3 >= r8) goto L55
            goto L6d
        L55:
            int r3 = r3 * 10
            int r10 = r6 + r9
            if (r3 >= r10) goto L5c
            goto L6d
        L5c:
            int r3 = r3 - r9
            int r4 = r4 + 1
            goto L3f
        L60:
            if (r7 == 0) goto L67
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            goto L6c
        L67:
            int r11 = -r3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L6c:
            r2 = r11
        L6d:
            return r2
    }

    /* renamed from: G */
    public static final java.lang.Long m13050G(java.lang.String r18) {
            r0 = r18
            r1 = 10
            gh.C2390b.m6112b(r1)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L10
            goto L7a
        L10:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = p214m2.C4339q.m9708m(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= 0) goto L33
            if (r2 != r9) goto L26
            goto L7a
        L26:
            r6 = 45
            if (r5 != r6) goto L2e
            r7 = -9223372036854775808
            r4 = 1
            goto L34
        L2e:
            r6 = 43
            if (r5 != r6) goto L7a
            goto L34
        L33:
            r9 = 0
        L34:
            r5 = 0
            r10 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r12 = r10
        L3c:
            if (r9 >= r2) goto L6d
            char r14 = r0.charAt(r9)
            int r14 = java.lang.Character.digit(r14, r1)
            if (r14 >= 0) goto L49
            goto L7a
        L49:
            int r15 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r15 >= 0) goto L59
            int r15 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r15 != 0) goto L7a
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r15 >= 0) goto L59
            goto L7a
        L59:
            long r10 = (long) r1
            long r5 = r5 * r10
            long r10 = (long) r14
            long r16 = r7 + r10
            int r14 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            goto L7a
        L64:
            long r5 = r5 - r10
            int r9 = r9 + 1
            r10 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L3c
        L6d:
            if (r4 == 0) goto L74
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L79
        L74:
            long r0 = -r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L79:
            r3 = r0
        L7a:
            return r3
    }
}
