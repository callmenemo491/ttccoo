package io.tacocrypto.app.p156ui.settings;

/* renamed from: io.tacocrypto.app.ui.settings.h */
/* loaded from: classes.dex */
public final class C3273h extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p086f2.InterfaceC1987b<? extends ch.C0981h<? extends java.lang.String, ? extends java.lang.Integer, ? extends java.lang.String>>, java.lang.Integer, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14383Z;

    public C3273h(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
            r0 = this;
            r0.f14383Z = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0985l mo122l(p086f2.InterfaceC1987b<? extends ch.C0981h<? extends java.lang.String, ? extends java.lang.Integer, ? extends java.lang.String>> r5, java.lang.Integer r6) {
            r4 = this;
            f2.b r5 = (p086f2.InterfaceC1987b) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            java.lang.String r6 = "$this$onLongClick"
            p214m2.C4339q.m9706k(r5, r6)
            io.tacocrypto.app.ui.settings.SettingsFragment r6 = r4.f14383Z
            androidx.fragment.app.s r6 = r6.m1330q0()
            java.lang.Object r5 = r5.getItem()
            ch.h r5 = (ch.C0981h) r5
            C r5 = r5.f5059a0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "text"
            p214m2.C4339q.m9706k(r5, r0)
            r0 = 2
            r1 = 0
            java.lang.String r2 = "clipboard"
            java.lang.Object r2 = r6.getSystemService(r2)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L46
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2     // Catch: java.lang.Throwable -> L4e
            android.content.ClipData r5 = android.content.ClipData.newPlainText(r5, r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = "newPlainText(text, text)"
            p214m2.C4339q.m9705j(r5, r3)     // Catch: java.lang.Throwable -> L4e
            r2.setPrimaryClip(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = "copied!"
            vg.C6664e.m13511l(r6, r5, r1, r0)     // Catch: java.lang.Throwable -> L4e
            ch.l r5 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L4e
            goto L53
        L46:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "null cannot be cast to non-null type android.content.ClipboardManager"
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r5 = move-exception
            java.lang.Object r5 = p074e9.C1805a.m4520e(r5)
        L53:
            java.lang.Throwable r5 = ch.C0979f.m2690b(r5)
            if (r5 == 0) goto L5e
            java.lang.String r5 = "copying error"
            vg.C6664e.m13511l(r6, r5, r1, r0)
        L5e:
            io.tacocrypto.app.ui.settings.SettingsFragment r5 = r4.f14383Z
            androidx.fragment.app.s r5 = r5.m1330q0()
            r0 = 50
            java.lang.String r6 = "vibrator"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch: java.lang.Exception -> L8a
            boolean r6 = r5 instanceof android.os.Vibrator     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L73
            android.os.Vibrator r5 = (android.os.Vibrator) r5     // Catch: java.lang.Exception -> L8a
            goto L74
        L73:
            r5 = 0
        L74:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L8a
            r2 = 26
            if (r6 < r2) goto L85
            if (r5 == 0) goto L8a
            r6 = -1
            android.os.VibrationEffect r6 = android.os.VibrationEffect.createOneShot(r0, r6)     // Catch: java.lang.Exception -> L8a
            r5.vibrate(r6)     // Catch: java.lang.Exception -> L8a
            goto L8a
        L85:
            if (r5 == 0) goto L8a
            r5.vibrate(r0)     // Catch: java.lang.Exception -> L8a
        L8a:
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
