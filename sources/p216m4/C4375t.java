package p216m4;

/* renamed from: m4.t */
/* loaded from: classes.dex */
public final class C4375t {

    /* renamed from: a */
    public final p371v5.C6571u f17929a;

    public C4375t() {
            r2 = this;
            r2.<init>()
            v5.u r0 = new v5.u
            r1 = 10
            r0.<init>(r1)
            r2.f17929a = r0
            return
    }

    /* renamed from: a */
    public p427y4.C7110a m9829a(p216m4.InterfaceC4365j r8, p051d5.C1288g.a r9) {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            v5.u r3 = r7.f17929a     // Catch: java.io.EOFException -> L48
            byte[] r3 = r3.f25710a     // Catch: java.io.EOFException -> L48
            r4 = 10
            r8.mo9795o(r3, r0, r4)     // Catch: java.io.EOFException -> L48
            v5.u r3 = r7.f17929a
            r3.m13396F(r0)
            v5.u r3 = r7.f17929a
            int r3 = r3.m13420w()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r3 == r5) goto L1d
            goto L48
        L1d:
            v5.u r3 = r7.f17929a
            r5 = 3
            r3.m13397G(r5)
            v5.u r3 = r7.f17929a
            int r3 = r3.m13417t()
            int r5 = r3 + 10
            if (r1 != 0) goto L43
            byte[] r1 = new byte[r5]
            v5.u r6 = r7.f17929a
            byte[] r6 = r6.f25710a
            java.lang.System.arraycopy(r6, r0, r1, r0, r4)
            r8.mo9795o(r1, r4, r3)
            d5.g r3 = new d5.g
            r3.<init>(r9)
            y4.a r1 = r3.m3759d(r1, r5)
            goto L46
        L43:
            r8.mo9796p(r3)
        L46:
            int r2 = r2 + r5
            goto L3
        L48:
            r8.mo9790h()
            r8.mo9796p(r2)
            return r1
    }
}
