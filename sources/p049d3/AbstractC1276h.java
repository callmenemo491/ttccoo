package p049d3;

import android.view.View;

@java.lang.Deprecated
/* renamed from: d3.h */
/* loaded from: classes.dex */
public abstract class AbstractC1276h<T extends android.view.View, Z> extends p049d3.AbstractC1269a<Z> {

    /* renamed from: Y */
    public final T f6753Y;

    /* renamed from: Z */
    public final p049d3.AbstractC1276h.a f6754Z;

    /* renamed from: d3.h$a */
    public static final class a {

        /* renamed from: d */
        public static java.lang.Integer f6755d;

        /* renamed from: a */
        public final android.view.View f6756a;

        /* renamed from: b */
        public final java.util.List<p049d3.InterfaceC1274f> f6757b;

        /* renamed from: c */
        public p049d3.AbstractC1276h.a.ViewTreeObserverOnPreDrawListenerC7373a f6758c;

        /* renamed from: d3.h$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC7373a implements android.view.ViewTreeObserver.OnPreDrawListener {

            /* renamed from: Y */
            public final java.lang.ref.WeakReference<p049d3.AbstractC1276h.a> f6759Y;

            public ViewTreeObserverOnPreDrawListenerC7373a(p049d3.AbstractC1276h.a r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.f6759Y = r0
                    return
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                    r5 = this;
                    java.lang.String r0 = "ViewTarget"
                    r1 = 2
                    boolean r1 = android.util.Log.isLoggable(r0, r1)
                    if (r1 == 0) goto L1d
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "OnGlobalLayoutListener called attachStateListener="
                    r1.append(r2)
                    r1.append(r5)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.v(r0, r1)
                L1d:
                    java.lang.ref.WeakReference<d3.h$a> r0 = r5.f6759Y
                    java.lang.Object r0 = r0.get()
                    d3.h$a r0 = (p049d3.AbstractC1276h.a) r0
                    if (r0 == 0) goto L5d
                    java.util.List<d3.f> r1 = r0.f6757b
                    boolean r1 = r1.isEmpty()
                    if (r1 == 0) goto L30
                    goto L5d
                L30:
                    int r1 = r0.m3734d()
                    int r2 = r0.m3733c()
                    boolean r3 = r0.m3735e(r1, r2)
                    if (r3 != 0) goto L3f
                    goto L5d
                L3f:
                    java.util.ArrayList r3 = new java.util.ArrayList
                    java.util.List<d3.f> r4 = r0.f6757b
                    r3.<init>(r4)
                    java.util.Iterator r3 = r3.iterator()
                L4a:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L5a
                    java.lang.Object r4 = r3.next()
                    d3.f r4 = (p049d3.InterfaceC1274f) r4
                    r4.mo2579b(r1, r2)
                    goto L4a
                L5a:
                    r0.m3731a()
                L5d:
                    r0 = 1
                    return r0
            }
        }

        public a(android.view.View r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f6757b = r0
                r1.f6756a = r2
                return
        }

        /* renamed from: a */
        public void m3731a() {
                r2 = this;
                android.view.View r0 = r2.f6756a
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                boolean r1 = r0.isAlive()
                if (r1 == 0) goto L11
                d3.h$a$a r1 = r2.f6758c
                r0.removeOnPreDrawListener(r1)
            L11:
                r0 = 0
                r2.f6758c = r0
                java.util.List<d3.f> r0 = r2.f6757b
                r0.clear()
                return
        }

        /* renamed from: b */
        public final int m3732b(int r2, int r3, int r4) {
                r1 = this;
                int r0 = r3 - r4
                if (r0 <= 0) goto L5
                return r0
            L5:
                int r2 = r2 - r4
                if (r2 <= 0) goto L9
                return r2
            L9:
                android.view.View r2 = r1.f6756a
                boolean r2 = r2.isLayoutRequested()
                if (r2 != 0) goto L5a
                r2 = -2
                if (r3 != r2) goto L5a
                r2 = 4
                java.lang.String r3 = "ViewTarget"
                boolean r2 = android.util.Log.isLoggable(r3, r2)
                if (r2 == 0) goto L22
                java.lang.String r2 = "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions."
                android.util.Log.i(r3, r2)
            L22:
                android.view.View r2 = r1.f6756a
                android.content.Context r2 = r2.getContext()
                java.lang.Integer r3 = p049d3.AbstractC1276h.a.f6755d
                if (r3 != 0) goto L53
                java.lang.String r3 = "window"
                java.lang.Object r2 = r2.getSystemService(r3)
                android.view.WindowManager r2 = (android.view.WindowManager) r2
                java.lang.String r3 = "Argument must not be null"
                java.util.Objects.requireNonNull(r2, r3)
                android.view.Display r2 = r2.getDefaultDisplay()
                android.graphics.Point r3 = new android.graphics.Point
                r3.<init>()
                r2.getSize(r3)
                int r2 = r3.x
                int r3 = r3.y
                int r2 = java.lang.Math.max(r2, r3)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                p049d3.AbstractC1276h.a.f6755d = r2
            L53:
                java.lang.Integer r2 = p049d3.AbstractC1276h.a.f6755d
                int r2 = r2.intValue()
                return r2
            L5a:
                r2 = 0
                return r2
        }

        /* renamed from: c */
        public final int m3733c() {
                r3 = this;
                android.view.View r0 = r3.f6756a
                int r0 = r0.getPaddingTop()
                android.view.View r1 = r3.f6756a
                int r1 = r1.getPaddingBottom()
                int r1 = r1 + r0
                android.view.View r0 = r3.f6756a
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 == 0) goto L18
                int r0 = r0.height
                goto L19
            L18:
                r0 = 0
            L19:
                android.view.View r2 = r3.f6756a
                int r2 = r2.getHeight()
                int r0 = r3.m3732b(r2, r0, r1)
                return r0
        }

        /* renamed from: d */
        public final int m3734d() {
                r3 = this;
                android.view.View r0 = r3.f6756a
                int r0 = r0.getPaddingLeft()
                android.view.View r1 = r3.f6756a
                int r1 = r1.getPaddingRight()
                int r1 = r1 + r0
                android.view.View r0 = r3.f6756a
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 == 0) goto L18
                int r0 = r0.width
                goto L19
            L18:
                r0 = 0
            L19:
                android.view.View r2 = r3.f6756a
                int r2 = r2.getWidth()
                int r0 = r3.m3732b(r2, r0, r1)
                return r0
        }

        /* renamed from: e */
        public final boolean m3735e(int r4, int r5) {
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r4 > 0) goto Lb
                if (r4 != r2) goto L9
                goto Lb
            L9:
                r4 = 0
                goto Lc
            Lb:
                r4 = 1
            Lc:
                if (r4 == 0) goto L19
                if (r5 > 0) goto L15
                if (r5 != r2) goto L13
                goto L15
            L13:
                r4 = 0
                goto L16
            L15:
                r4 = 1
            L16:
                if (r4 == 0) goto L19
                goto L1a
            L19:
                r0 = 0
            L1a:
                return r0
        }
    }

    public AbstractC1276h(T r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f6753Y = r2
            d3.h$a r0 = new d3.h$a
            r0.<init>(r2)
            r1.f6754Z = r0
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: e */
    public void mo2568e(p049d3.InterfaceC1274f r5) {
            r4 = this;
            d3.h$a r0 = r4.f6754Z
            int r1 = r0.m3734d()
            int r2 = r0.m3733c()
            boolean r3 = r0.m3735e(r1, r2)
            if (r3 == 0) goto L16
            c3.j r5 = (p033c3.C0864j) r5
            r5.mo2579b(r1, r2)
            goto L37
        L16:
            java.util.List<d3.f> r1 = r0.f6757b
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L23
            java.util.List<d3.f> r1 = r0.f6757b
            r1.add(r5)
        L23:
            d3.h$a$a r5 = r0.f6758c
            if (r5 != 0) goto L37
            android.view.View r5 = r0.f6756a
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            d3.h$a$a r1 = new d3.h$a$a
            r1.<init>(r0)
            r0.f6758c = r1
            r5.addOnPreDrawListener(r1)
        L37:
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: f */
    public void mo2569f(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: g */
    public void mo2570g(p033c3.InterfaceC0858d r3) {
            r2 = this;
            T extends android.view.View r0 = r2.f6753Y
            r1 = 2131362213(0x7f0a01a5, float:1.83442E38)
            r0.setTag(r1, r3)
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: i */
    public void mo2572i(p049d3.InterfaceC1274f r2) {
            r1 = this;
            d3.h$a r0 = r1.f6754Z
            java.util.List<d3.f> r0 = r0.f6757b
            r0.remove(r2)
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: j */
    public p033c3.InterfaceC0858d mo2573j() {
            r2 = this;
            T extends android.view.View r0 = r2.f6753Y
            r1 = 2131362213(0x7f0a01a5, float:1.83442E38)
            java.lang.Object r0 = r0.getTag(r1)
            r1 = 0
            if (r0 == 0) goto L1c
            boolean r1 = r0 instanceof p033c3.InterfaceC0858d
            if (r1 == 0) goto L14
            r1 = r0
            c3.d r1 = (p033c3.InterfaceC0858d) r1
            goto L1c
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must not call setTag() on a view Glide is targeting"
            r0.<init>(r1)
            throw r0
        L1c:
            return r1
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: k */
    public void mo2574k(android.graphics.drawable.Drawable r1) {
            r0 = this;
            d3.h$a r1 = r0.f6754Z
            r1.m3731a()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Target for: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            T extends android.view.View r1 = r2.f6753Y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
