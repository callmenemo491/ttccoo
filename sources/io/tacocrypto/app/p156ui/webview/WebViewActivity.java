package io.tacocrypto.app.p156ui.webview;

/* loaded from: classes.dex */
public final class WebViewActivity extends td.AbstractActivityC6214b<p171jd.C3487a> {
    public WebViewActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
            r0 = this;
            return
    }

    @Override // td.AbstractActivityC6214b
    /* renamed from: z */
    public p383w1.InterfaceC6776a mo7726z() {
            r4 = this;
            android.view.LayoutInflater r0 = r4.getLayoutInflater()
            r1 = 2131558431(0x7f0d001f, float:1.8742178E38)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            java.lang.String r1 = "rootView"
            java.util.Objects.requireNonNull(r0, r1)
            jd.a r1 = new jd.a
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r2 = 2
            r1.<init>(r0, r2)
            return r1
    }
}
