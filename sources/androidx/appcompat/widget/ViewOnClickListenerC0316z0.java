package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.z0 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0316z0 implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final p194l.C4150a f1506Y;

    /* renamed from: Z */
    public final /* synthetic */ androidx.appcompat.widget.C0260a1 f1507Z;

    public ViewOnClickListenerC0316z0(androidx.appcompat.widget.C0260a1 r8) {
            r7 = this;
            r7.f1507Z = r8
            r7.<init>()
            l.a r6 = new l.a
            androidx.appcompat.widget.Toolbar r0 = r8.f1202a
            android.content.Context r1 = r0.getContext()
            java.lang.CharSequence r5 = r8.f1210i
            r2 = 0
            r3 = 16908332(0x102002c, float:2.3877352E-38)
            r4 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f1506Y = r6
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            androidx.appcompat.widget.a1 r3 = r2.f1507Z
            android.view.Window$Callback r0 = r3.f1213l
            if (r0 == 0) goto L10
            boolean r3 = r3.f1214m
            if (r3 == 0) goto L10
            r3 = 0
            l.a r1 = r2.f1506Y
            r0.onMenuItemSelected(r3, r1)
        L10:
            return
    }
}
