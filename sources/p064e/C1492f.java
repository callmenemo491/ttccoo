package p064e;

/* renamed from: e.f */
/* loaded from: classes.dex */
public class C1492f {
    /* renamed from: a */
    public static boolean m4041a(android.os.Bundle r6, android.os.Bundle r7) {
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            java.lang.String r2 = "android.media.browse.extra.PAGE_SIZE"
            java.lang.String r3 = "android.media.browse.extra.PAGE"
            r4 = -1
            if (r6 != 0) goto L1b
            int r6 = r7.getInt(r3, r4)
            if (r6 != r4) goto L19
            int r6 = r7.getInt(r2, r4)
            if (r6 != r4) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
        L1b:
            if (r7 != 0) goto L2c
            int r7 = r6.getInt(r3, r4)
            if (r7 != r4) goto L2a
            int r6 = r6.getInt(r2, r4)
            if (r6 != r4) goto L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
        L2c:
            int r5 = r6.getInt(r3, r4)
            int r3 = r7.getInt(r3, r4)
            if (r5 != r3) goto L41
            int r6 = r6.getInt(r2, r4)
            int r7 = r7.getInt(r2, r4)
            if (r6 != r7) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            return r0
    }

    /* renamed from: b */
    public static int m4042b(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    /* renamed from: c */
    public static final p019b2.InterfaceC0655a<java.lang.Object> m4043c() {
            b2.c r0 = new b2.c
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: d */
    public static boolean m4044d(android.os.Bundle r6, android.os.Bundle r7) {
            java.lang.String r0 = "android.media.browse.extra.PAGE"
            r1 = -1
            if (r6 != 0) goto L7
            r2 = -1
            goto Lb
        L7:
            int r2 = r6.getInt(r0, r1)
        Lb:
            if (r7 != 0) goto Lf
            r0 = -1
            goto L13
        Lf:
            int r0 = r7.getInt(r0, r1)
        L13:
            java.lang.String r3 = "android.media.browse.extra.PAGE_SIZE"
            if (r6 != 0) goto L19
            r6 = -1
            goto L1d
        L19:
            int r6 = r6.getInt(r3, r1)
        L1d:
            if (r7 != 0) goto L21
            r7 = -1
            goto L25
        L21:
            int r7 = r7.getInt(r3, r1)
        L25:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1
            r5 = 0
            if (r2 == r1) goto L34
            if (r6 != r1) goto L2f
            goto L34
        L2f:
            int r2 = r2 * r6
            int r6 = r6 + r2
            int r6 = r6 - r4
            goto L38
        L34:
            r6 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
        L38:
            if (r0 == r1) goto L43
            if (r7 != r1) goto L3d
            goto L43
        L3d:
            int r0 = r0 * r7
            int r7 = r7 + r0
            int r3 = r7 + (-1)
            goto L44
        L43:
            r0 = 0
        L44:
            if (r6 < r0) goto L49
            if (r3 < r2) goto L49
            goto L4a
        L49:
            r4 = 0
        L4a:
            return r4
    }

    /* renamed from: e */
    public static boolean m4045e(android.net.Uri r2) {
            if (r2 == 0) goto L1c
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            java.lang.String r2 = r2.getAuthority()
            java.lang.String r0 = "media"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    /* renamed from: f */
    public static boolean m4046f(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L10
            if (r2 == r0) goto L10
            r0 = 512(0x200, float:7.17E-43)
            if (r1 > r0) goto L10
            r1 = 384(0x180, float:5.38E-43)
            if (r2 > r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    /* renamed from: g */
    public static long m4047g(p371v5.C6571u r8, int r9, int r10) {
            r8.m13396F(r9)
            int r9 = r8.m13398a()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 5
            if (r9 >= r2) goto L10
            return r0
        L10:
            int r9 = r8.m13403f()
            r2 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 & r9
            if (r2 == 0) goto L1a
            return r0
        L1a:
            r2 = 2096896(0x1fff00, float:2.938377E-39)
            r2 = r2 & r9
            int r2 = r2 >> 8
            if (r2 == r10) goto L23
            return r0
        L23:
            r9 = r9 & 32
            r10 = 0
            r2 = 1
            if (r9 == 0) goto L2b
            r9 = 1
            goto L2c
        L2b:
            r9 = 0
        L2c:
            if (r9 != 0) goto L2f
            return r0
        L2f:
            int r9 = r8.m13418u()
            r3 = 7
            if (r9 < r3) goto L83
            int r9 = r8.m13398a()
            if (r9 < r3) goto L83
            int r9 = r8.m13418u()
            r4 = 16
            r9 = r9 & r4
            if (r9 != r4) goto L47
            r9 = 1
            goto L48
        L47:
            r9 = 0
        L48:
            if (r9 == 0) goto L83
            r9 = 6
            byte[] r0 = new byte[r9]
            byte[] r1 = r8.f25710a
            int r4 = r8.f25711b
            java.lang.System.arraycopy(r1, r4, r0, r10, r9)
            int r1 = r8.f25711b
            int r1 = r1 + r9
            r8.f25711b = r1
            r8 = r0[r10]
            long r8 = (long) r8
            r4 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r4
            r10 = 25
            long r8 = r8 << r10
            r10 = r0[r2]
            long r6 = (long) r10
            long r6 = r6 & r4
            r10 = 17
            long r6 = r6 << r10
            long r8 = r8 | r6
            r10 = 2
            r10 = r0[r10]
            long r6 = (long) r10
            long r6 = r6 & r4
            r10 = 9
            long r6 = r6 << r10
            long r8 = r8 | r6
            r10 = 3
            r10 = r0[r10]
            long r6 = (long) r10
            long r6 = r6 & r4
            long r1 = r6 << r2
            long r8 = r8 | r1
            r10 = 4
            r10 = r0[r10]
            long r0 = (long) r10
            long r0 = r0 & r4
            long r0 = r0 >> r3
            long r8 = r8 | r0
            return r8
        L83:
            return r0
    }

    /* renamed from: h */
    public static p269p5.C5365f m4048h(p269p5.C5365f r3, java.lang.String[] r4, java.util.Map<java.lang.String, p269p5.C5365f> r5) {
            r0 = 0
            r1 = 1
            if (r3 != 0) goto L2e
            if (r4 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r2 = r4.length
            if (r2 != r1) goto L14
            r3 = r4[r0]
            java.lang.Object r3 = r5.get(r3)
            p5.f r3 = (p269p5.C5365f) r3
            return r3
        L14:
            int r2 = r4.length
            if (r2 <= r1) goto L55
            p5.f r3 = new p5.f
            r3.<init>()
            int r1 = r4.length
        L1d:
            if (r0 >= r1) goto L2d
            r2 = r4[r0]
            java.lang.Object r2 = r5.get(r2)
            p5.f r2 = (p269p5.C5365f) r2
            r3.m11689a(r2)
            int r0 = r0 + 1
            goto L1d
        L2d:
            return r3
        L2e:
            if (r4 == 0) goto L3f
            int r2 = r4.length
            if (r2 != r1) goto L3f
            r4 = r4[r0]
            java.lang.Object r4 = r5.get(r4)
            p5.f r4 = (p269p5.C5365f) r4
            r3.m11689a(r4)
            return r3
        L3f:
            if (r4 == 0) goto L55
            int r2 = r4.length
            if (r2 <= r1) goto L55
            int r1 = r4.length
        L45:
            if (r0 >= r1) goto L55
            r2 = r4[r0]
            java.lang.Object r2 = r5.get(r2)
            p5.f r2 = (p269p5.C5365f) r2
            r3.m11689a(r2)
            int r0 = r0 + 1
            goto L45
        L55:
            return r3
    }
}
