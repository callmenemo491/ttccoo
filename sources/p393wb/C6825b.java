package p393wb;

/* renamed from: wb.b */
/* loaded from: classes.dex */
public final class C6825b {

    /* renamed from: a */
    public static final int[] f26562a = null;

    static {
            r0 = 33
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12} // fill-array
            p393wb.C6825b.f26562a = r0
            return
    }

    /* renamed from: a */
    public static void m13905a(p453zb.C7270b r4, int r5, int r6) {
            r0 = 0
        L1:
            if (r0 >= r6) goto L1c
            int r1 = r5 - r0
            r2 = r1
        L6:
            int r3 = r5 + r0
            if (r2 > r3) goto L19
            r4.m14376f(r2, r1)
            r4.m14376f(r2, r3)
            r4.m14376f(r1, r2)
            r4.m14376f(r3, r2)
            int r2 = r2 + 1
            goto L6
        L19:
            int r0 = r0 + 2
            goto L1
        L1c:
            int r0 = r5 - r6
            r4.m14376f(r0, r0)
            int r1 = r0 + 1
            r4.m14376f(r1, r0)
            r4.m14376f(r0, r1)
            int r5 = r5 + r6
            r4.m14376f(r5, r0)
            r4.m14376f(r5, r1)
            int r6 = r5 + (-1)
            r4.m14376f(r5, r6)
            return
    }

    /* renamed from: b */
    public static p453zb.C7269a m13906b(p453zb.C7269a r11, int r12, int r13) {
            int r0 = r11.f27901Z
            int r0 = r0 / r13
            hb.h r1 = new hb.h
            r2 = 4
            if (r13 == r2) goto L2f
            r2 = 6
            if (r13 == r2) goto L2c
            r2 = 8
            if (r13 == r2) goto L29
            r2 = 10
            if (r13 == r2) goto L26
            r2 = 12
            if (r13 != r2) goto L1a
            ac.a r2 = ac.C0055a.f131h
            goto L31
        L1a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Unsupported word size "
            java.lang.String r12 = p422y.C7094d.m14209a(r12, r13)
            r11.<init>(r12)
            throw r11
        L26:
            ac.a r2 = ac.C0055a.f132i
            goto L31
        L29:
            ac.a r2 = ac.C0055a.f137n
            goto L31
        L2c:
            ac.a r2 = ac.C0055a.f133j
            goto L31
        L2f:
            ac.a r2 = ac.C0055a.f134k
        L31:
            r1.<init>(r2)
            int r2 = r12 / r13
            int[] r3 = new int[r2]
            int r4 = r11.f27901Z
            int r4 = r4 / r13
            r5 = 0
            r6 = 0
        L3d:
            if (r6 >= r4) goto L5d
            r7 = 0
            r8 = 0
        L41:
            if (r7 >= r13) goto L58
            int r9 = r6 * r13
            int r9 = r9 + r7
            boolean r9 = r11.m14364e(r9)
            if (r9 == 0) goto L53
            int r9 = r13 - r7
            r10 = 1
            int r9 = r9 - r10
            int r9 = r10 << r9
            goto L54
        L53:
            r9 = 0
        L54:
            r8 = r8 | r9
            int r7 = r7 + 1
            goto L41
        L58:
            r3[r6] = r8
            int r6 = r6 + 1
            goto L3d
        L5d:
            int r11 = r2 - r0
            r1.m7383i(r3, r11)
            int r12 = r12 % r13
            zb.a r11 = new zb.a
            r11.<init>()
            r11.m14362c(r5, r12)
        L6b:
            if (r5 >= r2) goto L75
            r12 = r3[r5]
            r11.m14362c(r12, r13)
            int r5 = r5 + 1
            goto L6b
        L75:
            return r11
    }

    /* renamed from: c */
    public static p453zb.C7269a m13907c(p453zb.C7269a r9, int r10) {
            zb.a r0 = new zb.a
            r0.<init>()
            int r1 = r9.f27901Z
            r2 = 1
            int r3 = r2 << r10
            int r3 = r3 + (-2)
            r4 = 0
            r5 = 0
        Le:
            if (r5 >= r1) goto L3b
            r6 = 0
            r7 = 0
        L12:
            if (r6 >= r10) goto L27
            int r8 = r5 + r6
            if (r8 >= r1) goto L1e
            boolean r8 = r9.m14364e(r8)
            if (r8 == 0) goto L24
        L1e:
            int r8 = r10 + (-1)
            int r8 = r8 - r6
            int r8 = r2 << r8
            r7 = r7 | r8
        L24:
            int r6 = r6 + 1
            goto L12
        L27:
            r6 = r7 & r3
            if (r6 != r3) goto L2c
            goto L30
        L2c:
            if (r6 != 0) goto L36
            r6 = r7 | 1
        L30:
            r0.m14362c(r6, r10)
            int r5 = r5 + (-1)
            goto L39
        L36:
            r0.m14362c(r7, r10)
        L39:
            int r5 = r5 + r10
            goto Le
        L3b:
            return r0
    }
}
