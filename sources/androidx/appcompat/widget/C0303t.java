package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0303t implements p264p0.InterfaceC5340d {

    /* renamed from: a */
    public final /* synthetic */ android.view.View f1432a;

    public C0303t(android.view.View r1) {
            r0 = this;
            r0.f1432a = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public boolean m786a(p264p0.C5341e r6, int r7, android.os.Bundle r8) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 25
            if (r0 < r3) goto L35
            r7 = r7 & r2
            if (r7 == 0) goto L35
            p0.e$c r7 = r6.f21234a     // Catch: java.lang.Exception -> L2c
            r7.mo11647d()     // Catch: java.lang.Exception -> L2c
            p0.e$c r7 = r6.f21234a
            java.lang.Object r7 = r7.mo11645b()
            android.view.inputmethod.InputContentInfo r7 = (android.view.inputmethod.InputContentInfo) r7
            if (r8 != 0) goto L20
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            goto L26
        L20:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r8)
            r8 = r0
        L26:
            java.lang.String r0 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r8.putParcelable(r0, r7)
            goto L35
        L2c:
            r6 = move-exception
            java.lang.String r7 = "ReceiveContent"
            java.lang.String r8 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r7, r8, r6)
            return r1
        L35:
            android.content.ClipData r7 = new android.content.ClipData
            p0.e$c r0 = r6.f21234a
            android.content.ClipDescription r0 = r0.mo11644a()
            android.content.ClipData$Item r3 = new android.content.ClipData$Item
            p0.e$c r4 = r6.f21234a
            android.net.Uri r4 = r4.mo11646c()
            r3.<init>(r4)
            r7.<init>(r0, r3)
            r0 = 2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L58
            n0.c$a r3 = new n0.c$a
            r3.<init>(r7, r0)
            goto L5d
        L58:
            n0.c$c r3 = new n0.c$c
            r3.<init>(r7, r0)
        L5d:
            p0.e$c r6 = r6.f21234a
            android.net.Uri r6 = r6.mo11648e()
            r3.mo10496d(r6)
            r3.mo10495c(r8)
            n0.c r6 = r3.mo10494b()
            android.view.View r7 = r5.f1432a
            n0.c r6 = p227n0.C4661t.m10541q(r7, r6)
            if (r6 != 0) goto L76
            r1 = 1
        L76:
            return r1
    }
}
