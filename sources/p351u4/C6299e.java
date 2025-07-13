package p351u4;

/* renamed from: u4.e */
/* loaded from: classes.dex */
public final class C6299e {

    /* renamed from: a */
    public int f24586a;

    /* renamed from: b */
    public long f24587b;

    /* renamed from: c */
    public int f24588c;

    /* renamed from: d */
    public int f24589d;

    /* renamed from: e */
    public int f24590e;

    /* renamed from: f */
    public final int[] f24591f;

    /* renamed from: g */
    public final p371v5.C6571u f24592g;

    public C6299e() {
            r2 = this;
            r2.<init>()
            r0 = 255(0xff, float:3.57E-43)
            int[] r1 = new int[r0]
            r2.f24591f = r1
            v5.u r1 = new v5.u
            r1.<init>(r0)
            r2.f24592g = r1
            return
    }

    /* renamed from: a */
    public boolean m12939a(p216m4.InterfaceC4365j r7, boolean r8) {
            r6 = this;
            r6.m12940b()
            v5.u r0 = r6.f24592g
            r1 = 27
            r0.m13392B(r1)
            v5.u r0 = r6.f24592g
            byte[] r0 = r0.f25710a
            r2 = 0
            boolean r0 = p216m4.C4367l.m9808b(r7, r0, r2, r1, r8)
            if (r0 == 0) goto L8e
            v5.u r0 = r6.f24592g
            long r0 = r0.m13419v()
            r3 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L23
            goto L8e
        L23:
            v5.u r0 = r6.f24592g
            int r0 = r0.m13418u()
            if (r0 == 0) goto L35
            if (r8 == 0) goto L2e
            return r2
        L2e:
            java.lang.String r7 = "unsupported bit stream revision"
            f4.s0 r7 = p088f4.C2044s0.m5408b(r7)
            throw r7
        L35:
            v5.u r0 = r6.f24592g
            int r0 = r0.m13418u()
            r6.f24586a = r0
            v5.u r0 = r6.f24592g
            long r0 = r0.m13406i()
            r6.f24587b = r0
            v5.u r0 = r6.f24592g
            r0.m13408k()
            v5.u r0 = r6.f24592g
            r0.m13408k()
            v5.u r0 = r6.f24592g
            r0.m13408k()
            v5.u r0 = r6.f24592g
            int r0 = r0.m13418u()
            r6.f24588c = r0
            int r1 = r0 + 27
            r6.f24589d = r1
            v5.u r1 = r6.f24592g
            r1.m13392B(r0)
            v5.u r0 = r6.f24592g
            byte[] r0 = r0.f25710a
            int r1 = r6.f24588c
            boolean r7 = p216m4.C4367l.m9808b(r7, r0, r2, r1, r8)
            if (r7 != 0) goto L72
            return r2
        L72:
            int r7 = r6.f24588c
            if (r2 >= r7) goto L8c
            int[] r7 = r6.f24591f
            v5.u r8 = r6.f24592g
            int r8 = r8.m13418u()
            r7[r2] = r8
            int r7 = r6.f24590e
            int[] r8 = r6.f24591f
            r8 = r8[r2]
            int r7 = r7 + r8
            r6.f24590e = r7
            int r2 = r2 + 1
            goto L72
        L8c:
            r7 = 1
            return r7
        L8e:
            return r2
    }

    /* renamed from: b */
    public void m12940b() {
            r3 = this;
            r0 = 0
            r3.f24586a = r0
            r1 = 0
            r3.f24587b = r1
            r3.f24588c = r0
            r3.f24589d = r0
            r3.f24590e = r0
            return
    }

    /* renamed from: c */
    public boolean m12941c(p216m4.InterfaceC4365j r9, long r10) {
            r8 = this;
            long r0 = r9.mo9797q()
            long r2 = r9.mo9794n()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            p371v5.C6549a.m13288b(r0)
            v5.u r0 = r8.f24592g
            r1 = 4
            r0.m13392B(r1)
        L1a:
            r2 = -1
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r2 = r9.mo9797q()
            r6 = 4
            long r2 = r2 + r6
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 >= 0) goto L4f
        L2b:
            v5.u r2 = r8.f24592g
            byte[] r2 = r2.f25710a
            boolean r2 = p216m4.C4367l.m9808b(r9, r2, r4, r1, r5)
            if (r2 == 0) goto L4f
            v5.u r0 = r8.f24592g
            r0.m13396F(r4)
            v5.u r0 = r8.f24592g
            long r2 = r0.m13419v()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L4b
            r9.mo9790h()
            return r5
        L4b:
            r9.mo9791i(r5)
            goto L1a
        L4f:
            if (r0 == 0) goto L59
            long r1 = r9.mo9797q()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L61
        L59:
            int r1 = r9.mo9787d(r5)
            r2 = -1
            if (r1 == r2) goto L61
            goto L4f
        L61:
            return r4
    }
}
