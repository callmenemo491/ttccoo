package ee;

/* renamed from: ee.b */
/* loaded from: classes.dex */
public final class C1824b extends androidx.recyclerview.widget.C0609t.g {
    public C1824b(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @Override // androidx.recyclerview.widget.C0609t.d
    /* renamed from: a */
    public void mo2130a(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r4) {
            r2 = this;
            java.lang.String r0 = "recyclerView"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "viewHolder"
            p214m2.C4339q.m9706k(r4, r0)
            super.mo2130a(r3, r4)
            android.view.View r3 = r4.f3208a
            r0 = 0
            r3.setElevation(r0)
            android.view.View r3 = r4.f3208a
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r1)
            android.view.View r3 = r4.f3208a
            r3.setTranslationZ(r0)
            return
    }

    @Override // androidx.recyclerview.widget.C0609t.d
    /* renamed from: h */
    public boolean mo2136h(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r4, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r5) {
            r2 = this;
            java.lang.String r0 = "recyclerView"
            p214m2.C4339q.m9706k(r3, r0)
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            boolean r0 = r3 instanceof ee.C1827e
            if (r0 == 0) goto L10
            ee.e r3 = (ee.C1827e) r3
            goto L11
        L10:
            r3 = 0
        L11:
            int r4 = r4.m1789f()
            int r5 = r5.m1789f()
            if (r3 == 0) goto L28
            java.util.List<io.tacocrypto.app.ui.secret.c> r0 = r3.f7957f
            java.lang.Object r0 = r0.remove(r4)
            io.tacocrypto.app.ui.secret.c r0 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r0
            java.util.List<io.tacocrypto.app.ui.secret.c> r1 = r3.f7957f
            r1.add(r5, r0)
        L28:
            if (r3 == 0) goto L2f
            androidx.recyclerview.widget.RecyclerView$f r3 = r3.f3228a
            r3.m1814c(r4, r5)
        L2f:
            r3 = 1
            return r3
    }

    @Override // androidx.recyclerview.widget.C0609t.d
    /* renamed from: i */
    public void mo2137i(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3, int r4) {
            r2 = this;
            r0 = 2
            if (r4 != r0) goto L2d
            r4 = 0
            if (r3 == 0) goto L9
            android.view.View r0 = r3.f3208a
            goto La
        L9:
            r0 = r4
        La:
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            r1 = 1090519040(0x41000000, float:8.0)
            r0.setElevation(r1)
        L12:
            if (r3 == 0) goto L17
            android.view.View r0 = r3.f3208a
            goto L18
        L17:
            r0 = r4
        L18:
            if (r0 != 0) goto L1b
            goto L21
        L1b:
            r1 = 1064514355(0x3f733333, float:0.95)
            r0.setAlpha(r1)
        L21:
            if (r3 == 0) goto L25
            android.view.View r4 = r3.f3208a
        L25:
            if (r4 != 0) goto L28
            goto L2d
        L28:
            r3 = 1098907648(0x41800000, float:16.0)
            r4.setTranslationZ(r3)
        L2d:
            return
    }

    @Override // androidx.recyclerview.widget.C0609t.d
    /* renamed from: j */
    public void mo2138j(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, int r2) {
            r0 = this;
            java.lang.String r2 = "viewHolder"
            p214m2.C4339q.m9706k(r1, r2)
            return
    }
}
