package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0258a extends android.view.ViewGroup {

    /* renamed from: a0 */
    public final androidx.appcompat.widget.AbstractC0258a.a f1177a0;

    /* renamed from: b0 */
    public final android.content.Context f1178b0;

    /* renamed from: c0 */
    public androidx.appcompat.widget.ActionMenuView f1179c0;

    /* renamed from: d0 */
    public androidx.appcompat.widget.C0264c f1180d0;

    /* renamed from: e0 */
    public int f1181e0;

    /* renamed from: f0 */
    public p227n0.C4664w f1182f0;

    /* renamed from: g0 */
    public boolean f1183g0;

    /* renamed from: h0 */
    public boolean f1184h0;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class a implements p227n0.InterfaceC4665x {

        /* renamed from: a */
        public boolean f1185a;

        /* renamed from: b */
        public int f1186b;

        /* renamed from: c */
        public final /* synthetic */ androidx.appcompat.widget.AbstractC0258a f1187c;

        public a(androidx.appcompat.widget.AbstractC0258a r1) {
                r0 = this;
                r0.f1187c = r1
                r0.<init>()
                r1 = 0
                r0.f1185a = r1
                return
        }

        @Override // p227n0.InterfaceC4665x
        /* renamed from: a */
        public void mo653a(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.f1185a = r1
                return
        }

        @Override // p227n0.InterfaceC4665x
        /* renamed from: b */
        public void mo654b(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f1185a
                if (r2 == 0) goto L5
                return
            L5:
                androidx.appcompat.widget.a r2 = r1.f1187c
                r0 = 0
                r2.f1182f0 = r0
                int r0 = r1.f1186b
                androidx.appcompat.widget.AbstractC0258a.m649b(r2, r0)
                return
        }

        @Override // p227n0.InterfaceC4665x
        /* renamed from: c */
        public void mo655c(android.view.View r2) {
                r1 = this;
                androidx.appcompat.widget.a r2 = r1.f1187c
                r0 = 0
                androidx.appcompat.widget.AbstractC0258a.m648a(r2, r0)
                r1.f1185a = r0
                return
        }
    }

    public AbstractC0258a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AbstractC0258a(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            androidx.appcompat.widget.a$a r4 = new androidx.appcompat.widget.a$a
            r4.<init>(r2)
            r2.f1177a0 = r4
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r5 = r3.getTheme()
            r0 = 2130968579(0x7f040003, float:1.7545816E38)
            r1 = 1
            boolean r5 = r5.resolveAttribute(r0, r4, r1)
            if (r5 == 0) goto L2b
            int r5 = r4.resourceId
            if (r5 == 0) goto L2b
            android.view.ContextThemeWrapper r5 = new android.view.ContextThemeWrapper
            int r4 = r4.resourceId
            r5.<init>(r3, r4)
            r2.f1178b0 = r5
            goto L2d
        L2b:
            r2.f1178b0 = r3
        L2d:
            return
    }

    /* renamed from: a */
    public static /* synthetic */ void m648a(androidx.appcompat.widget.AbstractC0258a r0, int r1) {
            super.setVisibility(r1)
            return
    }

    /* renamed from: b */
    public static /* synthetic */ void m649b(androidx.appcompat.widget.AbstractC0258a r0, int r1) {
            super.setVisibility(r1)
            return
    }

    /* renamed from: c */
    public int m650c(android.view.View r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r2.measure(r0, r4)
            int r2 = r2.getMeasuredWidth()
            int r3 = r3 - r2
            int r3 = r3 - r5
            r2 = 0
            int r2 = java.lang.Math.max(r2, r3)
            return r2
    }

    /* renamed from: d */
    public int m651d(android.view.View r3, int r4, int r5, int r6, boolean r7) {
            r2 = this;
            int r0 = r3.getMeasuredWidth()
            int r1 = r3.getMeasuredHeight()
            int r6 = r6 - r1
            int r6 = r6 / 2
            int r6 = r6 + r5
            if (r7 == 0) goto L15
            int r5 = r4 - r0
            int r1 = r1 + r6
            r3.layout(r5, r6, r4, r1)
            goto L1b
        L15:
            int r5 = r4 + r0
            int r1 = r1 + r6
            r3.layout(r4, r6, r5, r1)
        L1b:
            if (r7 == 0) goto L1e
            int r0 = -r0
        L1e:
            return r0
    }

    /* renamed from: e */
    public p227n0.C4664w m652e(int r3, long r4) {
            r2 = this;
            n0.w r0 = r2.f1182f0
            if (r0 == 0) goto L7
            r0.m10669b()
        L7:
            r0 = 0
            if (r3 != 0) goto L35
            int r1 = r2.getVisibility()
            if (r1 == 0) goto L13
            r2.setAlpha(r0)
        L13:
            n0.w r0 = p227n0.C4661t.m10526b(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.m10668a(r1)
            r0.m10670c(r4)
            androidx.appcompat.widget.a$a r4 = r2.f1177a0
            androidx.appcompat.widget.a r5 = r4.f1187c
            r5.f1182f0 = r0
            r4.f1186b = r3
            java.lang.ref.WeakReference<android.view.View> r3 = r0.f18590a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L34
            r0.m10672e(r3, r4)
        L34:
            return r0
        L35:
            n0.w r1 = p227n0.C4661t.m10526b(r2)
            r1.m10668a(r0)
            r1.m10670c(r4)
            androidx.appcompat.widget.a$a r4 = r2.f1177a0
            androidx.appcompat.widget.a r5 = r4.f1187c
            r5.f1182f0 = r1
            r4.f1186b = r3
            java.lang.ref.WeakReference<android.view.View> r3 = r1.f18590a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L54
            r1.m10672e(r3, r4)
        L54:
            return r1
    }

    public int getAnimatedVisibility() {
            r1 = this;
            n0.w r0 = r1.f1182f0
            if (r0 == 0) goto L9
            androidx.appcompat.widget.a$a r0 = r1.f1177a0
            int r0 = r0.f1186b
            return r0
        L9:
            int r0 = r1.getVisibility()
            return r0
    }

    public int getContentHeight() {
            r1 = this;
            int r0 = r1.f1181e0
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r5) {
            r4 = this;
            super.onConfigurationChanged(r5)
            android.content.Context r5 = r4.getContext()
            int[] r0 = p064e.C1495i.f7258a
            r1 = 0
            r2 = 2130968582(0x7f040006, float:1.7545822E38)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r1, r0, r2, r3)
            r0 = 13
            int r0 = r5.getLayoutDimension(r0, r3)
            r4.setContentHeight(r0)
            r5.recycle()
            androidx.appcompat.widget.c r5 = r4.f1180d0
            if (r5 == 0) goto L6b
            android.content.Context r0 = r5.f749Z
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            int r0 = r0.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r0 > r3) goto L60
            if (r1 > r3) goto L60
            r0 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r1 <= r3) goto L40
            if (r2 > r0) goto L60
        L40:
            if (r1 <= r0) goto L45
            if (r2 <= r3) goto L45
            goto L60
        L45:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L5e
            r0 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r1 <= r3) goto L51
            if (r2 > r0) goto L5e
        L51:
            if (r1 <= r0) goto L56
            if (r2 <= r3) goto L56
            goto L5e
        L56:
            r0 = 360(0x168, float:5.04E-43)
            if (r1 < r0) goto L5c
            r0 = 3
            goto L61
        L5c:
            r0 = 2
            goto L61
        L5e:
            r0 = 4
            goto L61
        L60:
            r0 = 5
        L61:
            r5.f1231o0 = r0
            androidx.appcompat.view.menu.e r5 = r5.f750a0
            if (r5 == 0) goto L6b
            r0 = 1
            r5.m513p(r0)
        L6b:
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.f1184h0 = r1
        Lb:
            boolean r3 = r5.f1184h0
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.f1184h0 = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L21
            r6 = 3
            if (r0 != r6) goto L23
        L21:
            r5.f1184h0 = r1
        L23:
            return r4
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.f1183g0 = r1
        L9:
            boolean r2 = r4.f1183g0
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.f1183g0 = r3
        L18:
            if (r0 == r3) goto L1d
            r5 = 3
            if (r0 != r5) goto L1f
        L1d:
            r4.f1183g0 = r1
        L1f:
            return r3
    }

    public abstract void setContentHeight(int r1);

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            n0.w r0 = r1.f1182f0
            if (r0 == 0) goto Ld
            r0.m10669b()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }
}
