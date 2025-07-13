package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC0207a implements androidx.appcompat.view.menu.InterfaceC0215i {

    /* renamed from: Y */
    public android.content.Context f748Y;

    /* renamed from: Z */
    public android.content.Context f749Z;

    /* renamed from: a0 */
    public androidx.appcompat.view.menu.C0211e f750a0;

    /* renamed from: b0 */
    public android.view.LayoutInflater f751b0;

    /* renamed from: c0 */
    public androidx.appcompat.view.menu.InterfaceC0215i.a f752c0;

    /* renamed from: d0 */
    public int f753d0;

    /* renamed from: e0 */
    public int f754e0;

    /* renamed from: f0 */
    public androidx.appcompat.view.menu.InterfaceC0216j f755f0;

    /* renamed from: g0 */
    public int f756g0;

    public AbstractC0207a(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f748Y = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.f751b0 = r1
            r0.f753d0 = r2
            r0.f754e0 = r3
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: A */
    public void mo468A(androidx.appcompat.view.menu.InterfaceC0215i.a r1) {
            r0 = this;
            r0.f752c0 = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: r */
    public int mo469r() {
            r1 = this;
            int r0 = r1.f756g0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: y */
    public boolean mo470y(androidx.appcompat.view.menu.C0211e r1, androidx.appcompat.view.menu.C0213g r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: z */
    public boolean mo471z(androidx.appcompat.view.menu.C0211e r1, androidx.appcompat.view.menu.C0213g r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
