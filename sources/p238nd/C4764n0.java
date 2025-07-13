package p238nd;

/* renamed from: nd.n0 */
/* loaded from: classes.dex */
public final class C4764n0 extends android.webkit.WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ p238nd.C4728b0 f19077a;

    public C4764n0(p238nd.C4728b0 r1) {
            r0 = this;
            r0.f19077a = r1
            r0.<init>()
            return
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView r3, java.lang.String r4) {
            r2 = this;
            super.onPageFinished(r3, r4)
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            hk.a$b r0 = hk.C3053a.f12282b
            java.lang.String r1 = "onPageFinished"
            r0.mo7467a(r1, r4)
            if (r3 == 0) goto L1b
            nd.b0 r4 = r2.f19077a
            java.util.Objects.requireNonNull(r4)
            nd.w r4 = p238nd.C4782w.f19147a
            java.lang.String r0 = "javascript:this.window.addEventListener('message', function onEvent(event){ Interface.mobileMethod(JSON.stringify(event.data)); }, false);"
            r3.evaluateJavascript(r0, r4)
        L1b:
            nd.b0 r3 = r2.f19077a
            od.x r3 = r3.f18921q
            if (r3 == 0) goto L26
            java.lang.String r3 = r3.getValue()
            goto L27
        L26:
            r3 = 0
        L27:
            nd.b0 r4 = r2.f19077a
            android.webkit.WebView r4 = r4.f18916l
            if (r4 == 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "javascript:"
            r0.append(r1)
            r0.append(r3)
            r3 = 59
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.loadUrl(r3)
        L46:
            return
    }
}
