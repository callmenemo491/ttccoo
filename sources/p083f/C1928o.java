package p083f;

/* renamed from: f.o */
/* loaded from: classes.dex */
public class C1928o extends p227n0.C4666y {

    /* renamed from: a */
    public final /* synthetic */ p083f.LayoutInflaterFactory2C1924k f8411a;

    public C1928o(p083f.LayoutInflaterFactory2C1924k r1) {
            r0 = this;
            r0.f8411a = r1
            r0.<init>()
            return
    }

    @Override // p227n0.InterfaceC4665x
    /* renamed from: b */
    public void mo654b(android.view.View r2) {
            r1 = this;
            f.k r2 = r1.f8411a
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f8362m0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            f.k r2 = r1.f8411a
            n0.w r2 = r2.f8365p0
            r0 = 0
            r2.m10671d(r0)
            f.k r2 = r1.f8411a
            r2.f8365p0 = r0
            return
    }

    @Override // p227n0.C4666y, p227n0.InterfaceC4665x
    /* renamed from: c */
    public void mo655c(android.view.View r2) {
            r1 = this;
            f.k r2 = r1.f8411a
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f8362m0
            r0 = 0
            r2.setVisibility(r0)
            f.k r2 = r1.f8411a
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f8362m0
            r0 = 32
            r2.sendAccessibilityEvent(r0)
            f.k r2 = r1.f8411a
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f8362m0
            android.view.ViewParent r2 = r2.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L2c
            f.k r2 = r1.f8411a
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f8362m0
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.g.m10595c(r2)
        L2c:
            return
    }
}
