package p240nj;

/* renamed from: nj.j */
/* loaded from: classes.dex */
public class C4852j {

    /* renamed from: nj.j$a */
    public static class a implements p240nj.InterfaceC4855m {

        /* renamed from: a */
        public final /* synthetic */ p240nj.AbstractC4845c f19298a;

        /* renamed from: b */
        public final /* synthetic */ p240nj.AbstractC4848f f19299b;

        public a(p240nj.AbstractC4845c r1, p240nj.AbstractC4848f r2) {
                r0 = this;
                r0.f19298a = r1
                r0.f19299b = r2
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4855m
        /* renamed from: a */
        public p240nj.InterfaceC4856n mo10945a(p240nj.InterfaceC4856n r11) {
                r10 = this;
                boolean r0 = r11 instanceof p240nj.C4851i
                if (r0 == 0) goto L7
                nj.i r11 = (p240nj.C4851i) r11
                goto L8
            L7:
                r11 = 0
            L8:
                nj.c r0 = r10.f19298a
                java.math.BigInteger r1 = r0.f19251d
                r2 = 1
                if (r1 != 0) goto L15
                int r0 = r0.mo10880m()
                int r0 = r0 + r2
                goto L19
            L15:
                int r0 = r1.bitLength()
            L19:
                r1 = 250(0xfa, float:3.5E-43)
                if (r0 <= r1) goto L1f
                r1 = 6
                goto L20
            L1f:
                r1 = 5
            L20:
                int r3 = r2 << r1
                r4 = 0
                if (r11 == 0) goto L36
                nj.e r5 = r11.f19296b
                if (r5 == 0) goto L31
                int r5 = r5.mo10888a()
                if (r5 < r3) goto L31
                r5 = 1
                goto L32
            L31:
                r5 = 0
            L32:
                if (r5 == 0) goto L36
                r5 = 1
                goto L37
            L36:
                r5 = 0
            L37:
                if (r5 == 0) goto L3a
                return r11
            L3a:
                int r0 = r0 + r1
                int r0 = r0 - r2
                int r0 = r0 / r1
                int r11 = r1 + 1
                nj.f[] r11 = new p240nj.AbstractC4848f[r11]
                nj.f r5 = r10.f19299b
                r11[r4] = r5
                r5 = 1
            L46:
                if (r5 >= r1) goto L55
                int r6 = r5 + (-1)
                r6 = r11[r6]
                nj.f r6 = r6.mo10942w(r0)
                r11[r5] = r6
                int r5 = r5 + 1
                goto L46
            L55:
                r0 = r11[r4]
                r5 = r11[r2]
                nj.f r0 = r0.mo10940u(r5)
                r11[r1] = r0
                nj.c r0 = r10.f19298a
                r0.m10883p(r11)
                nj.f[] r0 = new p240nj.AbstractC4848f[r3]
                r5 = r11[r4]
                r0[r4] = r5
                int r5 = r1 + (-1)
            L6c:
                if (r5 < 0) goto L86
                r6 = r11[r5]
                int r7 = r2 << r5
                r8 = r7
            L73:
                if (r8 >= r3) goto L83
                int r9 = r8 - r7
                r9 = r0[r9]
                nj.f r9 = r9.mo10920a(r6)
                r0[r8] = r9
                int r9 = r7 << 1
                int r8 = r8 + r9
                goto L73
            L83:
                int r5 = r5 + (-1)
                goto L6c
            L86:
                nj.c r2 = r10.f19298a
                r2.m10883p(r0)
                nj.i r2 = new nj.i
                r2.<init>()
                nj.c r5 = r10.f19298a
                nj.e r0 = r5.mo10870c(r0, r4, r3)
                r2.f19296b = r0
                r11 = r11[r1]
                r2.f19295a = r11
                r2.f19297c = r1
                return r2
        }
    }

    /* renamed from: a */
    public static p240nj.C4851i m10953a(p240nj.AbstractC4848f r3) {
            nj.c r0 = r3.f19286a
            nj.j$a r1 = new nj.j$a
            r1.<init>(r0, r3)
            java.lang.String r2 = "bc_fixed_point"
            nj.n r3 = r0.m10885r(r3, r2, r1)
            nj.i r3 = (p240nj.C4851i) r3
            return r3
    }
}
