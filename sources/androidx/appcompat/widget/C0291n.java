package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public class C0291n {

    /* renamed from: a */
    public final android.widget.ImageView f1388a;

    /* renamed from: b */
    public androidx.appcompat.widget.C0310w0 f1389b;

    /* renamed from: c */
    public androidx.appcompat.widget.C0310w0 f1390c;

    public C0291n(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>()
            r0.f1388a = r1
            return
    }

    /* renamed from: a */
    public void m768a() {
            r5 = this;
            android.widget.ImageView r0 = r5.f1388a
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.C0271e0.m708b(r0)
        Lb:
            if (r0 == 0) goto L6e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L17
        L15:
            r1 = 0
            goto L1a
        L17:
            if (r1 != r2) goto L15
            r1 = 1
        L1a:
            if (r1 == 0) goto L61
            androidx.appcompat.widget.w0 r1 = r5.f1390c
            if (r1 != 0) goto L27
            androidx.appcompat.widget.w0 r1 = new androidx.appcompat.widget.w0
            r1.<init>()
            r5.f1390c = r1
        L27:
            androidx.appcompat.widget.w0 r1 = r5.f1390c
            r2 = 0
            r1.f1475a = r2
            r1.f1478d = r4
            r1.f1476b = r2
            r1.f1477c = r4
            android.widget.ImageView r2 = r5.f1388a
            android.content.res.ColorStateList r2 = r2.getImageTintList()
            if (r2 == 0) goto L3e
            r1.f1478d = r3
            r1.f1475a = r2
        L3e:
            android.widget.ImageView r2 = r5.f1388a
            android.graphics.PorterDuff$Mode r2 = r2.getImageTintMode()
            if (r2 == 0) goto L4a
            r1.f1477c = r3
            r1.f1476b = r2
        L4a:
            boolean r2 = r1.f1478d
            if (r2 != 0) goto L55
            boolean r2 = r1.f1477c
            if (r2 == 0) goto L53
            goto L55
        L53:
            r3 = 0
            goto L5e
        L55:
            android.widget.ImageView r2 = r5.f1388a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0285k.m745f(r0, r1, r2)
        L5e:
            if (r3 == 0) goto L61
            return
        L61:
            androidx.appcompat.widget.w0 r1 = r5.f1389b
            if (r1 == 0) goto L6e
            android.widget.ImageView r2 = r5.f1388a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0285k.m745f(r0, r1, r2)
        L6e:
            return
    }

    /* renamed from: b */
    public void m769b(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.widget.ImageView r0 = r8.f1388a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p064e.C1495i.f7263f
            r1 = 0
            androidx.appcompat.widget.y0 r0 = androidx.appcompat.widget.C0314y0.m848r(r0, r9, r3, r10, r1)
            android.widget.ImageView r1 = r8.f1388a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1501b
            r7 = 0
            r4 = r9
            r6 = r10
            p227n0.C4661t.m10545u(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ImageView r9 = r8.f1388a     // Catch: java.lang.Throwable -> L71
            android.graphics.drawable.Drawable r9 = r9.getDrawable()     // Catch: java.lang.Throwable -> L71
            r10 = -1
            if (r9 != 0) goto L3c
            r1 = 1
            int r1 = r0.m861m(r1, r10)     // Catch: java.lang.Throwable -> L71
            if (r1 == r10) goto L3c
            android.widget.ImageView r9 = r8.f1388a     // Catch: java.lang.Throwable -> L71
            android.content.Context r9 = r9.getContext()     // Catch: java.lang.Throwable -> L71
            android.graphics.drawable.Drawable r9 = p102g.C2199a.m5784b(r9, r1)     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L3c
            android.widget.ImageView r1 = r8.f1388a     // Catch: java.lang.Throwable -> L71
            r1.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L71
        L3c:
            if (r9 == 0) goto L41
            androidx.appcompat.widget.C0271e0.m708b(r9)     // Catch: java.lang.Throwable -> L71
        L41:
            r9 = 2
            boolean r1 = r0.m864p(r9)     // Catch: java.lang.Throwable -> L71
            r2 = 21
            if (r1 == 0) goto L76
            android.widget.ImageView r1 = r8.f1388a     // Catch: java.lang.Throwable -> L71
            android.content.res.ColorStateList r9 = r0.m851c(r9)     // Catch: java.lang.Throwable -> L71
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L71
            r1.setImageTintList(r9)     // Catch: java.lang.Throwable -> L71
            if (r3 != r2) goto L76
            android.graphics.drawable.Drawable r9 = r1.getDrawable()     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L76
            android.content.res.ColorStateList r3 = r1.getImageTintList()     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L76
            boolean r3 = r9.isStateful()     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L73
            int[] r3 = r1.getDrawableState()     // Catch: java.lang.Throwable -> L71
            r9.setState(r3)     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r9 = move-exception
            goto Lb1
        L73:
            r1.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L71
        L76:
            r9 = 3
            boolean r1 = r0.m864p(r9)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto Lab
            android.widget.ImageView r1 = r8.f1388a     // Catch: java.lang.Throwable -> L71
            int r9 = r0.m858j(r9, r10)     // Catch: java.lang.Throwable -> L71
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.C0271e0.m710d(r9, r10)     // Catch: java.lang.Throwable -> L71
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L71
            r1.setImageTintMode(r9)     // Catch: java.lang.Throwable -> L71
            if (r10 != r2) goto Lab
            android.graphics.drawable.Drawable r9 = r1.getDrawable()     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto Lab
            android.content.res.ColorStateList r10 = r1.getImageTintList()     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto Lab
            boolean r10 = r9.isStateful()     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto La8
            int[] r10 = r1.getDrawableState()     // Catch: java.lang.Throwable -> L71
            r9.setState(r10)     // Catch: java.lang.Throwable -> L71
        La8:
            r1.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L71
        Lab:
            android.content.res.TypedArray r9 = r0.f1501b
            r9.recycle()
            return
        Lb1:
            android.content.res.TypedArray r10 = r0.f1501b
            r10.recycle()
            throw r9
    }

    /* renamed from: c */
    public void m770c(int r2) {
            r1 = this;
            if (r2 == 0) goto L17
            android.widget.ImageView r0 = r1.f1388a
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            if (r2 == 0) goto L11
            androidx.appcompat.widget.C0271e0.m708b(r2)
        L11:
            android.widget.ImageView r0 = r1.f1388a
            r0.setImageDrawable(r2)
            goto L1d
        L17:
            android.widget.ImageView r2 = r1.f1388a
            r0 = 0
            r2.setImageDrawable(r0)
        L1d:
            r1.m768a()
            return
    }

    /* renamed from: d */
    public void m771d(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.w0 r0 = r1.f1389b
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
            r0.<init>()
            r1.f1389b = r0
        Lb:
            androidx.appcompat.widget.w0 r0 = r1.f1389b
            r0.f1475a = r2
            r2 = 1
            r0.f1478d = r2
            r1.m768a()
            return
    }

    /* renamed from: e */
    public void m772e(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.w0 r0 = r1.f1389b
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
            r0.<init>()
            r1.f1389b = r0
        Lb:
            androidx.appcompat.widget.w0 r0 = r1.f1389b
            r0.f1476b = r2
            r2 = 1
            r0.f1477c = r2
            r1.m768a()
            return
    }
}
