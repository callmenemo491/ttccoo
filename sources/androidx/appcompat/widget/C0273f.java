package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public class C0273f {

    /* renamed from: a */
    public final android.view.View f1277a;

    /* renamed from: b */
    public final androidx.appcompat.widget.C0285k f1278b;

    /* renamed from: c */
    public int f1279c;

    /* renamed from: d */
    public androidx.appcompat.widget.C0310w0 f1280d;

    /* renamed from: e */
    public androidx.appcompat.widget.C0310w0 f1281e;

    /* renamed from: f */
    public androidx.appcompat.widget.C0310w0 f1282f;

    public C0273f(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1279c = r0
            r1.f1277a = r2
            androidx.appcompat.widget.k r2 = androidx.appcompat.widget.C0285k.m742a()
            r1.f1278b = r2
            return
    }

    /* renamed from: a */
    public void m711a() {
            r6 = this;
            android.view.View r0 = r6.f1277a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L7f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L18
            androidx.appcompat.widget.w0 r1 = r6.f1280d
            if (r1 == 0) goto L16
        L14:
            r1 = 1
            goto L1b
        L16:
            r1 = 0
            goto L1b
        L18:
            if (r1 != r2) goto L16
            goto L14
        L1b:
            if (r1 == 0) goto L64
            androidx.appcompat.widget.w0 r1 = r6.f1282f
            if (r1 != 0) goto L28
            androidx.appcompat.widget.w0 r1 = new androidx.appcompat.widget.w0
            r1.<init>()
            r6.f1282f = r1
        L28:
            androidx.appcompat.widget.w0 r1 = r6.f1282f
            r2 = 0
            r1.f1475a = r2
            r1.f1478d = r4
            r1.f1476b = r2
            r1.f1477c = r4
            android.view.View r2 = r6.f1277a
            java.util.WeakHashMap<android.view.View, n0.w> r5 = p227n0.C4661t.f18570a
            android.content.res.ColorStateList r2 = p227n0.C4661t.h.m10602g(r2)
            if (r2 == 0) goto L41
            r1.f1478d = r3
            r1.f1475a = r2
        L41:
            android.view.View r2 = r6.f1277a
            android.graphics.PorterDuff$Mode r2 = p227n0.C4661t.h.m10603h(r2)
            if (r2 == 0) goto L4d
            r1.f1477c = r3
            r1.f1476b = r2
        L4d:
            boolean r2 = r1.f1478d
            if (r2 != 0) goto L58
            boolean r2 = r1.f1477c
            if (r2 == 0) goto L56
            goto L58
        L56:
            r3 = 0
            goto L61
        L58:
            android.view.View r2 = r6.f1277a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0285k.m745f(r0, r1, r2)
        L61:
            if (r3 == 0) goto L64
            return
        L64:
            androidx.appcompat.widget.w0 r1 = r6.f1281e
            if (r1 == 0) goto L72
            android.view.View r2 = r6.f1277a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0285k.m745f(r0, r1, r2)
            goto L7f
        L72:
            androidx.appcompat.widget.w0 r1 = r6.f1280d
            if (r1 == 0) goto L7f
            android.view.View r2 = r6.f1277a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.C0285k.m745f(r0, r1, r2)
        L7f:
            return
    }

    /* renamed from: b */
    public android.content.res.ColorStateList m712b() {
            r1 = this;
            androidx.appcompat.widget.w0 r0 = r1.f1281e
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f1475a
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* renamed from: c */
    public android.graphics.PorterDuff.Mode m713c() {
            r1 = this;
            androidx.appcompat.widget.w0 r0 = r1.f1281e
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.f1476b
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* renamed from: d */
    public void m714d(android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.view.View r0 = r9.f1277a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p064e.C1495i.f7283z
            r8 = 0
            androidx.appcompat.widget.y0 r0 = androidx.appcompat.widget.C0314y0.m848r(r0, r10, r3, r11, r8)
            android.view.View r1 = r9.f1277a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1501b
            r7 = 0
            r4 = r10
            r6 = r11
            p227n0.C4661t.m10545u(r1, r2, r3, r4, r5, r6, r7)
            boolean r10 = r0.m864p(r8)     // Catch: java.lang.Throwable -> L77
            r11 = -1
            if (r10 == 0) goto L3b
            int r10 = r0.m861m(r8, r11)     // Catch: java.lang.Throwable -> L77
            r9.f1279c = r10     // Catch: java.lang.Throwable -> L77
            androidx.appcompat.widget.k r10 = r9.f1278b     // Catch: java.lang.Throwable -> L77
            android.view.View r1 = r9.f1277a     // Catch: java.lang.Throwable -> L77
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L77
            int r2 = r9.f1279c     // Catch: java.lang.Throwable -> L77
            android.content.res.ColorStateList r10 = r10.m747d(r1, r2)     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto L3b
            r9.m717g(r10)     // Catch: java.lang.Throwable -> L77
        L3b:
            r10 = 1
            boolean r1 = r0.m864p(r10)     // Catch: java.lang.Throwable -> L77
            r2 = 21
            if (r1 == 0) goto L7c
            android.view.View r1 = r9.f1277a     // Catch: java.lang.Throwable -> L77
            android.content.res.ColorStateList r3 = r0.m851c(r10)     // Catch: java.lang.Throwable -> L77
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L77
            p227n0.C4661t.h.m10612q(r1, r3)     // Catch: java.lang.Throwable -> L77
            if (r4 != r2) goto L7c
            android.graphics.drawable.Drawable r3 = r1.getBackground()     // Catch: java.lang.Throwable -> L77
            android.content.res.ColorStateList r4 = p227n0.C4661t.h.m10602g(r1)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L64
            android.graphics.PorterDuff$Mode r4 = p227n0.C4661t.h.m10603h(r1)     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L62
            goto L64
        L62:
            r4 = 0
            goto L65
        L64:
            r4 = 1
        L65:
            if (r3 == 0) goto L7c
            if (r4 == 0) goto L7c
            boolean r4 = r3.isStateful()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L79
            int[] r4 = r1.getDrawableState()     // Catch: java.lang.Throwable -> L77
            r3.setState(r4)     // Catch: java.lang.Throwable -> L77
            goto L79
        L77:
            r10 = move-exception
            goto Lc0
        L79:
            p227n0.C4661t.c.m10569q(r1, r3)     // Catch: java.lang.Throwable -> L77
        L7c:
            r1 = 2
            boolean r3 = r0.m864p(r1)     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto Lba
            android.view.View r3 = r9.f1277a     // Catch: java.lang.Throwable -> L77
            int r11 = r0.m858j(r1, r11)     // Catch: java.lang.Throwable -> L77
            r1 = 0
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.C0271e0.m710d(r11, r1)     // Catch: java.lang.Throwable -> L77
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L77
            p227n0.C4661t.h.m10613r(r3, r11)     // Catch: java.lang.Throwable -> L77
            if (r1 != r2) goto Lba
            android.graphics.drawable.Drawable r11 = r3.getBackground()     // Catch: java.lang.Throwable -> L77
            android.content.res.ColorStateList r1 = p227n0.C4661t.h.m10602g(r3)     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto La5
            android.graphics.PorterDuff$Mode r1 = p227n0.C4661t.h.m10603h(r3)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto La6
        La5:
            r8 = 1
        La6:
            if (r11 == 0) goto Lba
            if (r8 == 0) goto Lba
            boolean r10 = r11.isStateful()     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto Lb7
            int[] r10 = r3.getDrawableState()     // Catch: java.lang.Throwable -> L77
            r11.setState(r10)     // Catch: java.lang.Throwable -> L77
        Lb7:
            p227n0.C4661t.c.m10569q(r3, r11)     // Catch: java.lang.Throwable -> L77
        Lba:
            android.content.res.TypedArray r10 = r0.f1501b
            r10.recycle()
            return
        Lc0:
            android.content.res.TypedArray r11 = r0.f1501b
            r11.recycle()
            throw r10
    }

    /* renamed from: e */
    public void m715e() {
            r1 = this;
            r0 = -1
            r1.f1279c = r0
            r0 = 0
            r1.m717g(r0)
            r1.m711a()
            return
    }

    /* renamed from: f */
    public void m716f(int r3) {
            r2 = this;
            r2.f1279c = r3
            androidx.appcompat.widget.k r0 = r2.f1278b
            if (r0 == 0) goto L11
            android.view.View r1 = r2.f1277a
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r3 = r0.m747d(r1, r3)
            goto L12
        L11:
            r3 = 0
        L12:
            r2.m717g(r3)
            r2.m711a()
            return
    }

    /* renamed from: g */
    public void m717g(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            androidx.appcompat.widget.w0 r0 = r1.f1280d
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
            r0.<init>()
            r1.f1280d = r0
        Ld:
            androidx.appcompat.widget.w0 r0 = r1.f1280d
            r0.f1475a = r2
            r2 = 1
            r0.f1478d = r2
            goto L18
        L15:
            r2 = 0
            r1.f1280d = r2
        L18:
            r1.m711a()
            return
    }

    /* renamed from: h */
    public void m718h(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.w0 r0 = r1.f1281e
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
            r0.<init>()
            r1.f1281e = r0
        Lb:
            androidx.appcompat.widget.w0 r0 = r1.f1281e
            r0.f1475a = r2
            r2 = 1
            r0.f1478d = r2
            r1.m711a()
            return
    }

    /* renamed from: i */
    public void m719i(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.w0 r0 = r1.f1281e
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.w0 r0 = new androidx.appcompat.widget.w0
            r0.<init>()
            r1.f1281e = r0
        Lb:
            androidx.appcompat.widget.w0 r0 = r1.f1281e
            r0.f1476b = r2
            r2 = 1
            r0.f1477c = r2
            r1.m711a()
            return
    }
}
