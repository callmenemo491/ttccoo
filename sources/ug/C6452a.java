package ug;

/* renamed from: ug.a */
/* loaded from: classes.dex */
public final class C6452a extends p045d.AbstractC1255a<ch.C0985l, ch.C0978e<? extends java.lang.Boolean, ? extends java.lang.String>> {
    public C6452a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p045d.AbstractC1255a
    /* renamed from: a */
    public android.content.Intent mo1198a(android.content.Context r2, ch.C0985l r3) {
            r1 = this;
            ch.l r3 = (ch.C0985l) r3
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "input"
            p214m2.C4339q.m9706k(r3, r0)
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<io.tacocrypto.app.ui.webview.WebViewActivity> r0 = io.tacocrypto.app.p156ui.webview.WebViewActivity.class
            r3.<init>(r2, r0)
            return r3
    }

    @Override // p045d.AbstractC1255a
    /* renamed from: c */
    public ch.C0978e<? extends java.lang.Boolean, ? extends java.lang.String> mo1199c(int r4, android.content.Intent r5) {
            r3 = this;
            r0 = 0
            if (r5 == 0) goto La
            java.lang.String r1 = "webViewResult"
            java.io.Serializable r5 = r5.getSerializableExtra(r1)
            goto Lb
        La:
            r5 = r0
        Lb:
            boolean r1 = r5 instanceof ch.C0978e
            if (r1 == 0) goto L12
            ch.e r5 = (ch.C0978e) r5
            goto L13
        L12:
            r5 = r0
        L13:
            if (r5 == 0) goto L35
            A r1 = r5.f5050Y
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L35
            B r5 = r5.f5051Z
            if (r5 == 0) goto L22
            boolean r2 = r5 instanceof java.lang.String
            goto L23
        L22:
            r2 = 1
        L23:
            if (r2 != 0) goto L26
            goto L35
        L26:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Boolean"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r5 = (java.lang.String) r5
            ch.e r2 = new ch.e
            r2.<init>(r1, r5)
            goto L36
        L35:
            r2 = r0
        L36:
            r5 = -1
            if (r4 != r5) goto L3c
            if (r2 == 0) goto L3c
            r0 = r2
        L3c:
            return r0
    }
}
