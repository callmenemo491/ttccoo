package p277pi;

/* renamed from: pi.a */
/* loaded from: classes.dex */
public final class C5527a {

    /* renamed from: a */
    public static final byte[] f21527a = null;

    static {
            java.nio.charset.Charset r0 = p362uh.C6455a.f25034b
            java.lang.String r1 = "0123456789abcdef"
            byte[] r0 = r1.getBytes(r0)
            java.lang.String r1 = "(this as java.lang.String).getBytes(charset)"
            p214m2.C4339q.m9705j(r0, r1)
            p277pi.C5527a.f21527a = r0
            return
    }

    /* renamed from: a */
    public static final java.lang.String m11787a(p260oi.C5283e r6, long r7) {
            java.lang.String r0 = "$this$readUtf8Line"
            p214m2.C4339q.m9706k(r6, r0)
            r0 = 1
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1f
            long r2 = r7 - r0
            byte r4 = r6.m11554S(r2)
            r5 = 13
            byte r5 = (byte) r5
            if (r4 != r5) goto L1f
            java.lang.String r7 = r6.m11569m0(r2)
            r0 = 2
            goto L23
        L1f:
            java.lang.String r7 = r6.m11569m0(r7)
        L23:
            r6.mo11559b(r0)
            return r7
    }

    /* renamed from: b */
    public static final int m11788b(p260oi.C5283e r17, p260oi.C5295q r18, boolean r19) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "$this$selectPrefix"
            p214m2.C4339q.m9706k(r0, r2)
            java.lang.String r2 = "options"
            p214m2.C4339q.m9706k(r1, r2)
            oi.u r0 = r0.f20500Y
            r2 = -2
            r3 = -1
            if (r0 == 0) goto Laa
            byte[] r4 = r0.f20536a
            int r5 = r0.f20537b
            int r6 = r0.f20538c
            int[] r1 = r1.f20526Z
            r7 = 0
            r9 = r0
            r8 = 0
            r10 = -1
        L20:
            int r11 = r8 + 1
            r8 = r1[r8]
            int r12 = r11 + 1
            r11 = r1[r11]
            if (r11 == r3) goto L2b
            r10 = r11
        L2b:
            if (r9 != 0) goto L2e
            goto L5b
        L2e:
            r11 = 0
            if (r8 >= 0) goto L7b
            int r8 = r8 * (-1)
            int r13 = r8 + r12
        L35:
            int r8 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r12 + 1
            r12 = r1[r12]
            if (r5 == r12) goto L42
            return r10
        L42:
            if (r14 != r13) goto L46
            r5 = 1
            goto L47
        L46:
            r5 = 0
        L47:
            if (r8 != r6) goto L68
            p214m2.C4339q.m9704i(r9)
            oi.u r4 = r9.f20541f
            p214m2.C4339q.m9704i(r4)
            int r6 = r4.f20537b
            byte[] r8 = r4.f20536a
            int r9 = r4.f20538c
            if (r4 != r0) goto L62
            if (r5 != 0) goto L5f
        L5b:
            if (r19 == 0) goto L5e
            return r2
        L5e:
            return r10
        L5f:
            r4 = r8
            r8 = r11
            goto L6e
        L62:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L6e
        L68:
            r16 = r9
            r9 = r6
            r6 = r8
            r8 = r16
        L6e:
            if (r5 == 0) goto L76
            r5 = r1[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La0
        L76:
            r5 = r6
            r6 = r9
            r12 = r14
            r9 = r8
            goto L35
        L7b:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r12 + r8
        L83:
            if (r12 != r14) goto L86
            return r10
        L86:
            r15 = r1[r12]
            if (r5 != r15) goto La7
            int r12 = r12 + r8
            r5 = r1[r12]
            if (r13 != r6) goto La0
            oi.u r9 = r9.f20541f
            p214m2.C4339q.m9704i(r9)
            int r4 = r9.f20537b
            byte[] r6 = r9.f20536a
            int r8 = r9.f20538c
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La0
            r9 = r11
        La0:
            if (r5 < 0) goto La3
            return r5
        La3:
            int r8 = -r5
            r5 = r13
            goto L20
        La7:
            int r12 = r12 + 1
            goto L83
        Laa:
            if (r19 == 0) goto Lad
            goto Lae
        Lad:
            r2 = -1
        Lae:
            return r2
    }
}
