package androidx.mediarouter.app;

/* loaded from: classes.dex */
public class MediaRouteActionProvider extends p227n0.AbstractC4643b {

    /* renamed from: c */
    public final p085f1.C1974o f2588c;

    /* renamed from: d */
    public p085f1.C1973n f2589d;

    /* renamed from: e */
    public androidx.mediarouter.app.C0491k f2590e;

    /* renamed from: f */
    public androidx.mediarouter.app.C0481a f2591f;

    public MediaRouteActionProvider(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            f1.n r0 = p085f1.C1973n.f8666c
            r1.f2589d = r0
            androidx.mediarouter.app.k r0 = androidx.mediarouter.app.C0491k.f2759a
            r1.f2590e = r0
            f1.o r2 = p085f1.C1974o.m5026d(r2)
            r1.f2588c = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            return
    }

    @Override // p227n0.AbstractC4643b
    /* renamed from: b */
    public boolean mo1473b() {
            r3 = this;
            f1.o r0 = r3.f2588c
            f1.n r1 = r3.f2589d
            r2 = 1
            boolean r0 = r0.m5032h(r1, r2)
            if (r0 == 0) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // p227n0.AbstractC4643b
    /* renamed from: c */
    public android.view.View mo1474c() {
            r4 = this;
            androidx.mediarouter.app.a r0 = r4.f2591f
            if (r0 == 0) goto Lb
            java.lang.String r0 = "MRActionProvider"
            java.lang.String r1 = "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item..."
            android.util.Log.e(r0, r1)
        Lb:
            androidx.mediarouter.app.a r0 = new androidx.mediarouter.app.a
            android.content.Context r1 = r4.f18536a
            r0.<init>(r1)
            r4.f2591f = r0
            r1 = 1
            r0.setCheatSheetEnabled(r1)
            androidx.mediarouter.app.a r0 = r4.f2591f
            f1.n r1 = r4.f2589d
            r0.setRouteSelector(r1)
            androidx.mediarouter.app.a r0 = r4.f2591f
            r1 = 0
            r0.setAlwaysVisible(r1)
            androidx.mediarouter.app.a r0 = r4.f2591f
            androidx.mediarouter.app.k r1 = r4.f2590e
            r0.setDialogFactory(r1)
            androidx.mediarouter.app.a r0 = r4.f2591f
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            androidx.mediarouter.app.a r0 = r4.f2591f
            return r0
    }

    @Override // p227n0.AbstractC4643b
    /* renamed from: e */
    public boolean mo1475e() {
            r1 = this;
            androidx.mediarouter.app.a r0 = r1.f2591f
            if (r0 == 0) goto L9
            boolean r0 = r0.m1481d()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
