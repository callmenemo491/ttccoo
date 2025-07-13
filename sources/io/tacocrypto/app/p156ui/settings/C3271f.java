package io.tacocrypto.app.p156ui.settings;

/* renamed from: io.tacocrypto.app.ui.settings.f */
/* loaded from: classes.dex */
public final class C3271f extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<io.tacocrypto.app.p156ui.settings.SettingsFragment.C3253b, java.lang.Integer, ch.C0981h<? extends java.lang.String, ? extends java.lang.Integer, ? extends java.lang.String>, ch.C0985l> {

    /* renamed from: Z */
    public static final io.tacocrypto.app.p156ui.settings.C3271f f14381Z = null;

    static {
            io.tacocrypto.app.ui.settings.f r0 = new io.tacocrypto.app.ui.settings.f
            r0.<init>()
            io.tacocrypto.app.p156ui.settings.C3271f.f14381Z = r0
            return
    }

    public C3271f() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(io.tacocrypto.app.p156ui.settings.SettingsFragment.C3253b r3, java.lang.Integer r4, ch.C0981h<? extends java.lang.String, ? extends java.lang.Integer, ? extends java.lang.String> r5) {
            r2 = this;
            io.tacocrypto.app.ui.settings.SettingsFragment$b r3 = (io.tacocrypto.app.p156ui.settings.SettingsFragment.C3253b) r3
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            ch.h r5 = (ch.C0981h) r5
            java.lang.String r4 = "$this$onBind"
            p214m2.C4339q.m9706k(r3, r4)
            java.lang.String r4 = "item"
            p214m2.C4339q.m9706k(r5, r4)
            p214m2.C4339q.m9706k(r5, r4)
            android.view.View r3 = r3.f3208a
            r4 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r0 = p064e.C1494h.m4055f(r3, r4)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            if (r0 == 0) goto L45
            r4 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r1 = p064e.C1494h.m4055f(r3, r4)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L45
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            B r3 = r5.f5058Z
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.setImageResource(r3)
            A r3 = r5.f5057Y
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            ch.l r3 = ch.C0985l.f5061a
            return r3
        L45:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r4)
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "Missing required view with ID: "
            java.lang.String r3 = r5.concat(r3)
            r4.<init>(r3)
            throw r4
    }
}
