package p009a8;

/* renamed from: a8.b */
/* loaded from: classes.dex */
public class C0031b implements p220m8.C4430n.b {

    /* renamed from: a */
    public final /* synthetic */ boolean f71a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f72b;

    public C0031b(com.google.android.material.bottomsheet.BottomSheetBehavior r1, boolean r2) {
            r0 = this;
            r0.f72b = r1
            r0.f71a = r2
            r0.<init>()
            return
    }

    @Override // p220m8.C4430n.b
    /* renamed from: a */
    public p227n0.C4642a0 mo35a(android.view.View r7, p227n0.C4642a0 r8, p220m8.C4430n.c r9) {
            r6 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r6.f72b
            int r1 = r8.m10468d()
            r0.f5858r = r1
            boolean r0 = p220m8.C4430n.m9886d(r7)
            int r1 = r7.getPaddingBottom()
            int r2 = r7.getPaddingLeft()
            int r3 = r7.getPaddingRight()
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r6.f72b
            boolean r5 = r4.f5853m
            if (r5 == 0) goto L2b
            int r1 = r8.m10465a()
            r4.f5857q = r1
            int r1 = r9.f18090d
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r6.f72b
            int r4 = r4.f5857q
            int r1 = r1 + r4
        L2b:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r6.f72b
            boolean r4 = r4.f5854n
            if (r4 == 0) goto L3d
            if (r0 == 0) goto L36
            int r2 = r9.f18089c
            goto L38
        L36:
            int r2 = r9.f18087a
        L38:
            int r4 = r8.m10466b()
            int r2 = r2 + r4
        L3d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r6.f72b
            boolean r4 = r4.f5855o
            if (r4 == 0) goto L50
            if (r0 == 0) goto L48
            int r9 = r9.f18087a
            goto L4a
        L48:
            int r9 = r9.f18089c
        L4a:
            int r0 = r8.m10467c()
            int r3 = r0 + r9
        L50:
            int r9 = r7.getPaddingTop()
            r7.setPadding(r2, r9, r3, r1)
            boolean r7 = r6.f71a
            if (r7 == 0) goto L67
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r6.f72b
            n0.a0$k r9 = r8.f18506a
            f0.c r9 = r9.mo10492f()
            int r9 = r9.f8484d
            r7.f5851k = r9
        L67:
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r6.f72b
            boolean r9 = r7.f5853m
            if (r9 != 0) goto L71
            boolean r9 = r6.f71a
            if (r9 == 0) goto L75
        L71:
            r9 = 0
            r7.m3293M(r9)
        L75:
            return r8
    }
}
