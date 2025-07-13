package p026b9;

/* renamed from: b9.c0 */
/* loaded from: classes.dex */
public class C0693c0<E> extends p026b9.AbstractC0714n<E> {

    /* renamed from: c0 */
    public static final p026b9.AbstractC0714n<java.lang.Object> f3898c0 = null;

    /* renamed from: a0 */
    public final transient java.lang.Object[] f3899a0;

    /* renamed from: b0 */
    public final transient int f3900b0;

    static {
            b9.c0 r0 = new b9.c0
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            p026b9.C0693c0.f3898c0 = r0
            return
    }

    public C0693c0(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f3899a0 = r1
            r0.f3900b0 = r2
            return
    }

    @Override // p026b9.AbstractC0714n, p026b9.AbstractC0710l
    /* renamed from: e */
    public int mo2260e(java.lang.Object[] r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.f3899a0
            int r1 = r3.f3900b0
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r5, r1)
            int r4 = r3.f3900b0
            int r5 = r5 + r4
            return r5
    }

    @Override // java.util.List
    public E get(int r2) {
            r1 = this;
            int r0 = r1.f3900b0
            p124h7.C2939x3.m7280f(r2, r0)
            java.lang.Object[] r0 = r1.f3899a0
            r2 = r0[r2]
            return r2
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: h */
    public java.lang.Object[] mo2261h() {
            r1 = this;
            java.lang.Object[] r0 = r1.f3899a0
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: i */
    public int mo2262i() {
            r1 = this;
            int r0 = r1.f3900b0
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: l */
    public int mo2263l() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: m */
    public boolean mo2264m() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.f3900b0
            return r0
    }
}
