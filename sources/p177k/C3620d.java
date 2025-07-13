package p177k;

/* renamed from: k.d */
/* loaded from: classes.dex */
public class C3620d extends p177k.AbstractC3617a implements androidx.appcompat.view.menu.C0211e.a {

    /* renamed from: a0 */
    public android.content.Context f15942a0;

    /* renamed from: b0 */
    public androidx.appcompat.widget.ActionBarContextView f15943b0;

    /* renamed from: c0 */
    public p177k.AbstractC3617a.a f15944c0;

    /* renamed from: d0 */
    public java.lang.ref.WeakReference<android.view.View> f15945d0;

    /* renamed from: e0 */
    public boolean f15946e0;

    /* renamed from: f0 */
    public androidx.appcompat.view.menu.C0211e f15947f0;

    public C3620d(android.content.Context r1, androidx.appcompat.widget.ActionBarContextView r2, p177k.AbstractC3617a.a r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f15942a0 = r1
            r0.f15943b0 = r2
            r0.f15944c0 = r3
            androidx.appcompat.view.menu.e r1 = new androidx.appcompat.view.menu.e
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r2 = 1
            r1.f819l = r2
            r0.f15947f0 = r1
            r1.f812e = r0
            return
    }

    @Override // androidx.appcompat.view.menu.C0211e.a
    /* renamed from: a */
    public boolean mo523a(androidx.appcompat.view.menu.C0211e r1, android.view.MenuItem r2) {
            r0 = this;
            k.a$a r1 = r0.f15944c0
            boolean r1 = r1.mo4758a(r0, r2)
            return r1
    }

    @Override // androidx.appcompat.view.menu.C0211e.a
    /* renamed from: b */
    public void mo524b(androidx.appcompat.view.menu.C0211e r1) {
            r0 = this;
            r0.mo4808i()
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f15943b0
            androidx.appcompat.widget.c r1 = r1.f1180d0
            if (r1 == 0) goto Lc
            r1.m699g()
        Lc:
            return
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: c */
    public void mo4802c() {
            r2 = this;
            boolean r0 = r2.f15946e0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.f15946e0 = r0
            androidx.appcompat.widget.ActionBarContextView r0 = r2.f15943b0
            r1 = 32
            r0.sendAccessibilityEvent(r1)
            k.a$a r0 = r2.f15944c0
            r0.mo4761d(r2)
            return
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: d */
    public android.view.View mo4803d() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f15945d0
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: e */
    public android.view.Menu mo4804e() {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f15947f0
            return r0
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: f */
    public android.view.MenuInflater mo4805f() {
            r2 = this;
            k.f r0 = new k.f
            androidx.appcompat.widget.ActionBarContextView r1 = r2.f15943b0
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: g */
    public java.lang.CharSequence mo4806g() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: h */
    public java.lang.CharSequence mo4807h() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: i */
    public void mo4808i() {
            r2 = this;
            k.a$a r0 = r2.f15944c0
            androidx.appcompat.view.menu.e r1 = r2.f15947f0
            r0.mo4760c(r2, r1)
            return
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: j */
    public boolean mo4809j() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            boolean r0 = r0.f923s0
            return r0
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: k */
    public void mo4810k(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            r0.setCustomView(r2)
            if (r2 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.f15945d0 = r0
            return
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: l */
    public void mo4811l(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f15942a0
            java.lang.String r2 = r0.getString(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            r0.setSubtitle(r2)
            return
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: m */
    public void mo4812m(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            r0.setSubtitle(r2)
            return
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: n */
    public void mo4813n(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f15942a0
            java.lang.String r2 = r0.getString(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            r0.setTitle(r2)
            return
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: o */
    public void mo4814o(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            r0.setTitle(r2)
            return
    }

    @Override // p177k.AbstractC3617a
    /* renamed from: p */
    public void mo4815p(boolean r2) {
            r1 = this;
            r1.f15936Z = r2
            androidx.appcompat.widget.ActionBarContextView r0 = r1.f15943b0
            r0.setTitleOptional(r2)
            return
    }
}
