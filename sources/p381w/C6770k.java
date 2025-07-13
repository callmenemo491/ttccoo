package p381w;

/* renamed from: w.k */
/* loaded from: classes.dex */
public class C6770k extends p381w.C6765f implements p381w.InterfaceC6769j {

    /* renamed from: H0 */
    public p381w.C6765f[] f26239H0;

    /* renamed from: I0 */
    public int f26240I0;

    public C6770k() {
            r1 = this;
            r1.<init>()
            r0 = 4
            w.f[] r0 = new p381w.C6765f[r0]
            r1.f26239H0 = r0
            r0 = 0
            r1.f26240I0 = r0
            return
    }

    /* renamed from: S */
    public void m13744S(java.util.ArrayList<p401x.C6907o> r4, int r5, p401x.C6907o r6) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.f26240I0
            if (r1 >= r2) goto L10
            w.f[] r2 = r3.f26239H0
            r2 = r2[r1]
            r6.m13998a(r2)
            int r1 = r1 + 1
            goto L2
        L10:
            int r1 = r3.f26240I0
            if (r0 >= r1) goto L1e
            w.f[] r1 = r3.f26239H0
            r1 = r1[r0]
            p401x.C6901i.m13988a(r1, r5, r4, r6)
            int r0 = r0 + 1
            goto L10
        L1e:
            return
    }

    @Override // p381w.InterfaceC6769j
    /* renamed from: a */
    public void mo13741a(p381w.C6766g r1) {
            r0 = this;
            return
    }

    @Override // p381w.InterfaceC6769j
    /* renamed from: b */
    public void mo13742b() {
            r2 = this;
            r0 = 0
            r2.f26240I0 = r0
            w.f[] r0 = r2.f26239H0
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // p381w.InterfaceC6769j
    /* renamed from: c */
    public void mo13743c(p381w.C6765f r4) {
            r3 = this;
            if (r4 == r3) goto L23
            if (r4 != 0) goto L5
            goto L23
        L5:
            int r0 = r3.f26240I0
            int r0 = r0 + 1
            w.f[] r1 = r3.f26239H0
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            w.f[] r0 = (p381w.C6765f[]) r0
            r3.f26239H0 = r0
        L19:
            w.f[] r0 = r3.f26239H0
            int r1 = r3.f26240I0
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f26240I0 = r1
        L23:
            return
    }

    @Override // p381w.C6765f
    /* renamed from: i */
    public void mo13676i(p381w.C6765f r4, java.util.HashMap<p381w.C6765f, p381w.C6765f> r5) {
            r3 = this;
            super.mo13676i(r4, r5)
            w.k r4 = (p381w.C6770k) r4
            r0 = 0
            r3.f26240I0 = r0
            int r1 = r4.f26240I0
        La:
            if (r0 >= r1) goto L1c
            w.f[] r2 = r4.f26239H0
            r2 = r2[r0]
            java.lang.Object r2 = r5.get(r2)
            w.f r2 = (p381w.C6765f) r2
            r3.mo13743c(r2)
            int r0 = r0 + 1
            goto La
        L1c:
            return
    }
}
