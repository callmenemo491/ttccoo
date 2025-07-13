package p083f;

/* renamed from: f.n */
/* loaded from: classes.dex */
public class RunnableC1927n implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p083f.LayoutInflaterFactory2C1924k f8409Y;

    /* renamed from: f.n$a */
    public class a extends p227n0.C4666y {

        /* renamed from: a */
        public final /* synthetic */ p083f.RunnableC1927n f8410a;

        public a(p083f.RunnableC1927n r1) {
                r0 = this;
                r0.f8410a = r1
                r0.<init>()
                return
        }

        @Override // p227n0.InterfaceC4665x
        /* renamed from: b */
        public void mo654b(android.view.View r2) {
                r1 = this;
                f.n r2 = r1.f8410a
                f.k r2 = r2.f8409Y
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f8362m0
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                f.n r2 = r1.f8410a
                f.k r2 = r2.f8409Y
                n0.w r2 = r2.f8365p0
                r0 = 0
                r2.m10671d(r0)
                f.n r2 = r1.f8410a
                f.k r2 = r2.f8409Y
                r2.f8365p0 = r0
                return
        }

        @Override // p227n0.C4666y, p227n0.InterfaceC4665x
        /* renamed from: c */
        public void mo655c(android.view.View r2) {
                r1 = this;
                f.n r2 = r1.f8410a
                f.k r2 = r2.f8409Y
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f8362m0
                r0 = 0
                r2.setVisibility(r0)
                return
        }
    }

    public RunnableC1927n(p083f.LayoutInflaterFactory2C1924k r1) {
            r0 = this;
            r0.f8409Y = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            f.k r0 = r4.f8409Y
            android.widget.PopupWindow r1 = r0.f8363n0
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8362m0
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            f.k r0 = r4.f8409Y
            r0.m4741I()
            f.k r0 = r4.f8409Y
            boolean r0 = r0.m4754V()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L47
            f.k r0 = r4.f8409Y
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8362m0
            r2 = 0
            r0.setAlpha(r2)
            f.k r0 = r4.f8409Y
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f8362m0
            n0.w r2 = p227n0.C4661t.m10526b(r2)
            r2.m10668a(r1)
            r0.f8365p0 = r2
            f.k r0 = r4.f8409Y
            n0.w r0 = r0.f8365p0
            f.n$a r1 = new f.n$a
            r1.<init>(r4)
            java.lang.ref.WeakReference<android.view.View> r2 = r0.f18590a
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L55
            r0.m10672e(r2, r1)
            goto L55
        L47:
            f.k r0 = r4.f8409Y
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8362m0
            r0.setAlpha(r1)
            f.k r0 = r4.f8409Y
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f8362m0
            r0.setVisibility(r3)
        L55:
            return
    }
}
