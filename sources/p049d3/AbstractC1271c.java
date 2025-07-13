package p049d3;

/* renamed from: d3.c */
/* loaded from: classes.dex */
public abstract class AbstractC1271c<T> implements p049d3.InterfaceC1275g<T> {

    /* renamed from: Y */
    public final int f6749Y;

    /* renamed from: Z */
    public final int f6750Z;

    /* renamed from: a0 */
    public p033c3.InterfaceC0858d f6751a0;

    public AbstractC1271c() {
            r2 = this;
            r2.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r1 = p106g3.C2238j.m5850j(r0, r0)
            if (r1 == 0) goto L10
            r2.f6749Y = r0
            r2.f6750Z = r0
            return
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648"
            r0.<init>(r1)
            throw r0
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: c */
    public void mo2566c(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: d */
    public void mo2567d() {
            r0 = this;
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: e */
    public final void mo2568e(p049d3.InterfaceC1274f r3) {
            r2 = this;
            int r0 = r2.f6749Y
            int r1 = r2.f6750Z
            c3.j r3 = (p033c3.C0864j) r3
            r3.mo2579b(r0, r1)
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: f */
    public void mo2569f(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: g */
    public final void mo2570g(p033c3.InterfaceC0858d r1) {
            r0 = this;
            r0.f6751a0 = r1
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: i */
    public final void mo2572i(p049d3.InterfaceC1274f r1) {
            r0 = this;
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: j */
    public final p033c3.InterfaceC0858d mo2573j() {
            r1 = this;
            c3.d r0 = r1.f6751a0
            return r0
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: l */
    public void mo2575l() {
            r0 = this;
            return
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: m */
    public void mo2576m() {
            r0 = this;
            return
    }
}
