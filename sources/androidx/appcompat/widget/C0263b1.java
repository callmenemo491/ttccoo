package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.b1 */
/* loaded from: classes.dex */
public class C0263b1 {
    /* renamed from: a */
    public static void m693a(android.view.View r2, java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            r2.setTooltipText(r3)
            goto L37
        La:
            androidx.appcompat.widget.c1 r0 = androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1249h0
            r1 = 0
            if (r0 == 0) goto L16
            android.view.View r0 = r0.f1251Y
            if (r0 != r2) goto L16
            androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.m701c(r1)
        L16:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L32
            androidx.appcompat.widget.c1 r3 = androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1250i0
            if (r3 == 0) goto L27
            android.view.View r0 = r3.f1251Y
            if (r0 != r2) goto L27
            r3.m703b()
        L27:
            r2.setOnLongClickListener(r1)
            r3 = 0
            r2.setLongClickable(r3)
            r2.setOnHoverListener(r1)
            goto L37
        L32:
            androidx.appcompat.widget.c1 r0 = new androidx.appcompat.widget.c1
            r0.<init>(r2, r3)
        L37:
            return
    }
}
