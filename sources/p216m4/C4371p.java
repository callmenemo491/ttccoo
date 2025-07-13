package p216m4;

/* renamed from: m4.p */
/* loaded from: classes.dex */
public final class C4371p {
    /* renamed from: a */
    public static p427y4.C7110a m9816a(p216m4.InterfaceC4365j r9, boolean r10) {
            r0 = 0
            if (r10 == 0) goto L5
            r10 = r0
            goto L7
        L5:
            d5.g$a r10 = p051d5.C1288g.f6785b
        L7:
            v5.u r1 = new v5.u
            r2 = 10
            r1.<init>(r2)
            r3 = 0
            r4 = r0
            r5 = 0
        L11:
            byte[] r6 = r1.f25710a     // Catch: java.io.EOFException -> L48
            r9.mo9795o(r6, r3, r2)     // Catch: java.io.EOFException -> L48
            r1.m13396F(r3)
            int r6 = r1.m13420w()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r6 == r7) goto L23
            goto L49
        L23:
            r6 = 3
            r1.m13397G(r6)
            int r6 = r1.m13417t()
            int r7 = r6 + 10
            if (r4 != 0) goto L43
            byte[] r4 = new byte[r7]
            byte[] r8 = r1.f25710a
            java.lang.System.arraycopy(r8, r3, r4, r3, r2)
            r9.mo9795o(r4, r2, r6)
            d5.g r6 = new d5.g
            r6.<init>(r10)
            y4.a r4 = r6.m3759d(r4, r7)
            goto L46
        L43:
            r9.mo9796p(r6)
        L46:
            int r5 = r5 + r7
            goto L11
        L48:
        L49:
            r9.mo9790h()
            r9.mo9796p(r5)
            if (r4 == 0) goto L58
            y4.a$b[] r9 = r4.f27506Y
            int r9 = r9.length
            if (r9 != 0) goto L57
            goto L58
        L57:
            r0 = r4
        L58:
            return r0
    }

    /* renamed from: b */
    public static p216m4.C4373r.a m9817b(p371v5.C6571u r11) {
            r0 = 1
            r11.m13397G(r0)
            int r0 = r11.m13420w()
            int r1 = r11.f25711b
            long r1 = (long) r1
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r0 / 18
            long[] r3 = new long[r0]
            long[] r4 = new long[r0]
            r5 = 0
        L14:
            if (r5 >= r0) goto L38
            long r6 = r11.m13411n()
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L29
            long[] r3 = java.util.Arrays.copyOf(r3, r5)
            long[] r4 = java.util.Arrays.copyOf(r4, r5)
            goto L38
        L29:
            r3[r5] = r6
            long r6 = r11.m13411n()
            r4[r5] = r6
            r6 = 2
            r11.m13397G(r6)
            int r5 = r5 + 1
            goto L14
        L38:
            int r0 = r11.f25711b
            long r5 = (long) r0
            long r1 = r1 - r5
            int r0 = (int) r1
            r11.m13397G(r0)
            m4.r$a r11 = new m4.r$a
            r11.<init>(r3, r4)
            return r11
    }
}
