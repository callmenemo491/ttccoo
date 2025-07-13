package p238nd;

/* renamed from: nd.o0 */
/* loaded from: classes.dex */
public final class C4767o0 extends android.webkit.WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ p238nd.C4728b0 f19083a;

    public C4767o0(p238nd.C4728b0 r1) {
            r0 = this;
            r0.f19083a = r1
            r0.<init>()
            return
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(android.webkit.WebView r3) {
            r2 = this;
            super.onCloseWindow(r3)
            nd.b0 r0 = r2.f19083a
            java.util.List<android.webkit.WebView> r0 = r0.f18914j
            boolean r1 = r0 instanceof p259oh.InterfaceC5277a
            if (r1 != 0) goto L1a
            r0.remove(r3)
            if (r3 == 0) goto L19
            nd.b0 r0 = r2.f19083a
            nd.b r0 = r0.f18917m
            if (r0 == 0) goto L19
            r0.mo7751h(r3)
        L19:
            return
        L1a:
            java.lang.String r3 = "kotlin.collections.MutableCollection"
            p239nh.C4840t.m10857c(r0, r3)
            r3 = 0
            throw r3
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(android.webkit.WebView r2, boolean r3, boolean r4, android.os.Message r5) {
            r1 = this;
            nd.b0 r2 = r1.f19083a
            p214m2.C4339q.m9704i(r5)
            java.util.Objects.requireNonNull(r2)
            java.lang.String r3 = "createAddNewWebView"
            hk.a$b r3 = hk.C3053a.m7466a(r3)
            java.lang.String r4 = r5.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.mo7467a(r4, r0)
            android.webkit.WebView r3 = new android.webkit.WebView
            android.content.Context r4 = r2.f18905a
            r3.<init>(r4)
            r2.m10802p(r3)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r4.<init>(r0, r0)
            java.util.List<android.webkit.WebView> r0 = r2.f18914j
            r0.add(r3)
            r3.setLayoutParams(r4)
            nd.b r4 = r2.f18917m
            if (r4 == 0) goto L37
            r4.mo7752n(r3)
        L37:
            java.lang.Object r4 = r5.obj
            java.lang.String r0 = "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport"
            java.util.Objects.requireNonNull(r4, r0)
            android.webkit.WebView$WebViewTransport r4 = (android.webkit.WebView.WebViewTransport) r4
            r4.setWebView(r3)
            r5.sendToTarget()
            nd.o0 r2 = r2.f18904C
            r3.setWebChromeClient(r2)
            android.webkit.WebViewClient r2 = new android.webkit.WebViewClient
            r2.<init>()
            r3.setWebViewClient(r2)
            r2 = 1
            return r2
    }
}
