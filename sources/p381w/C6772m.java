package p381w;

/* renamed from: w.m */
/* loaded from: classes.dex */
public class C6772m extends p381w.C6770k {

    /* renamed from: J0 */
    public boolean f26242J0;

    public C6772m() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f26242J0 = r0
            return
    }

    /* renamed from: T */
    public void m13747T() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f26240I0
            if (r0 >= r1) goto L11
            w.f[] r1 = r3.f26239H0
            r1 = r1[r0]
            if (r1 == 0) goto Le
            r2 = 1
            r1.f26108C = r2
        Le:
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // p381w.C6770k, p381w.InterfaceC6769j
    /* renamed from: a */
    public void mo13741a(p381w.C6766g r1) {
            r0 = this;
            r0.m13747T()
            return
    }
}
