package td;

/* renamed from: td.e */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC6217e implements android.content.DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ int f24172a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f24173b;

    public /* synthetic */ DialogInterfaceOnShowListenerC6217e(je.C3583e r2) {
            r1 = this;
            r0 = 3
            r1.f24172a = r0
            r1.<init>()
            r1.f24173b = r2
            return
    }

    public /* synthetic */ DialogInterfaceOnShowListenerC6217e(td.AbstractC6218f r2) {
            r1 = this;
            r0 = 0
            r1.f24172a = r0
            r1.<init>()
            r1.f24173b = r2
            return
    }

    public /* synthetic */ DialogInterfaceOnShowListenerC6217e(p359ud.C6379b r2) {
            r1 = this;
            r0 = 1
            r1.f24172a = r0
            r1.<init>()
            r1.f24173b = r2
            return
    }

    public /* synthetic */ DialogInterfaceOnShowListenerC6217e(p395wd.C6833b r2) {
            r1 = this;
            r0 = 2
            r1.f24172a = r0
            r1.<init>()
            r1.f24173b = r2
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface r10) {
            r9 = this;
            int r0 = r9.f24172a
            r1 = 3
            r2 = 1
            java.lang.String r3 = "from(bottomSheet)"
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.FrameLayout"
            r5 = 2131362096(0x7f0a0130, float:1.8343963E38)
            java.lang.String r6 = "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog"
            java.lang.String r7 = "this$0"
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L3f;
                case 2: goto L14;
                default: goto L12;
            }
        L12:
            goto Lbb
        L14:
            java.lang.Object r0 = r9.f24173b
            wd.b r0 = (p395wd.C6833b) r0
            int r8 = p395wd.C6833b.f26579n1
            p214m2.C4339q.m9706k(r0, r7)
            java.util.Objects.requireNonNull(r10, r6)
            com.google.android.material.bottomsheet.a r10 = (com.google.android.material.bottomsheet.DialogC1134a) r10
            android.view.View r10 = r10.findViewById(r5)
            java.util.Objects.requireNonNull(r10, r4)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.m3280y(r10)
            p214m2.C4339q.m9705j(r0, r3)
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            r10.setLayoutParams(r3)
            r0.f5821D = r2
            r0.m3284D(r1)
            return
        L3f:
            java.lang.Object r0 = r9.f24173b
            ud.b r0 = (p359ud.C6379b) r0
            int r8 = p359ud.C6379b.f24858o1
            p214m2.C4339q.m9706k(r0, r7)
            java.util.Objects.requireNonNull(r10, r6)
            com.google.android.material.bottomsheet.a r10 = (com.google.android.material.bottomsheet.DialogC1134a) r10
            android.view.View r10 = r10.findViewById(r5)
            java.util.Objects.requireNonNull(r10, r4)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.m3280y(r10)
            p214m2.C4339q.m9705j(r0, r3)
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            int r4 = r4 * 90
            int r4 = r4 / 100
            r3.height = r4
            r10.setLayoutParams(r3)
            r0.f5821D = r2
            r0.m3284D(r1)
            return
        L7a:
            java.lang.Object r0 = r9.f24173b
            td.f r0 = (td.AbstractC6218f) r0
            int r8 = td.AbstractC6218f.f24174l1
            p214m2.C4339q.m9706k(r0, r7)
            java.util.Objects.requireNonNull(r10, r6)
            com.google.android.material.bottomsheet.a r10 = (com.google.android.material.bottomsheet.DialogC1134a) r10
            android.view.View r10 = r10.findViewById(r5)
            java.util.Objects.requireNonNull(r10, r4)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.m3280y(r10)
            p214m2.C4339q.m9705j(r4, r3)
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            boolean r0 = r0.mo111O0()
            if (r0 == 0) goto Lb2
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            int r0 = r0 * 90
            int r0 = r0 / 100
            r3.height = r0
        Lb2:
            r10.setLayoutParams(r3)
            r4.f5821D = r2
            r4.m3284D(r1)
            return
        Lbb:
            java.lang.Object r0 = r9.f24173b
            je.e r0 = (je.C3583e) r0
            int r8 = je.C3583e.f15701o1
            p214m2.C4339q.m9706k(r0, r7)
            java.util.Objects.requireNonNull(r10, r6)
            com.google.android.material.bottomsheet.a r10 = (com.google.android.material.bottomsheet.DialogC1134a) r10
            android.view.View r10 = r10.findViewById(r5)
            java.util.Objects.requireNonNull(r10, r4)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.m3280y(r10)
            p214m2.C4339q.m9705j(r0, r3)
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            r10.setLayoutParams(r3)
            r0.f5821D = r2
            r0.m3284D(r1)
            return
    }
}
