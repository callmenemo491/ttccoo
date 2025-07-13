package androidx.appcompat.app;

/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    public androidx.core.widget.NestedScrollView f648A;

    /* renamed from: B */
    public int f649B;

    /* renamed from: C */
    public android.graphics.drawable.Drawable f650C;

    /* renamed from: D */
    public android.widget.ImageView f651D;

    /* renamed from: E */
    public android.widget.TextView f652E;

    /* renamed from: F */
    public android.widget.TextView f653F;

    /* renamed from: G */
    public android.view.View f654G;

    /* renamed from: H */
    public android.widget.ListAdapter f655H;

    /* renamed from: I */
    public int f656I;

    /* renamed from: J */
    public int f657J;

    /* renamed from: K */
    public int f658K;

    /* renamed from: L */
    public int f659L;

    /* renamed from: M */
    public int f660M;

    /* renamed from: N */
    public int f661N;

    /* renamed from: O */
    public int f662O;

    /* renamed from: P */
    public boolean f663P;

    /* renamed from: Q */
    public android.os.Handler f664Q;

    /* renamed from: R */
    public final android.view.View.OnClickListener f665R;

    /* renamed from: a */
    public final android.content.Context f666a;

    /* renamed from: b */
    public final p083f.DialogC1929p f667b;

    /* renamed from: c */
    public final android.view.Window f668c;

    /* renamed from: d */
    public final int f669d;

    /* renamed from: e */
    public java.lang.CharSequence f670e;

    /* renamed from: f */
    public java.lang.CharSequence f671f;

    /* renamed from: g */
    public android.widget.ListView f672g;

    /* renamed from: h */
    public android.view.View f673h;

    /* renamed from: i */
    public int f674i;

    /* renamed from: j */
    public int f675j;

    /* renamed from: k */
    public int f676k;

    /* renamed from: l */
    public int f677l;

    /* renamed from: m */
    public int f678m;

    /* renamed from: n */
    public boolean f679n;

    /* renamed from: o */
    public android.widget.Button f680o;

    /* renamed from: p */
    public java.lang.CharSequence f681p;

    /* renamed from: q */
    public android.os.Message f682q;

    /* renamed from: r */
    public android.graphics.drawable.Drawable f683r;

    /* renamed from: s */
    public android.widget.Button f684s;

    /* renamed from: t */
    public java.lang.CharSequence f685t;

    /* renamed from: u */
    public android.os.Message f686u;

    /* renamed from: v */
    public android.graphics.drawable.Drawable f687v;

    /* renamed from: w */
    public android.widget.Button f688w;

    /* renamed from: x */
    public java.lang.CharSequence f689x;

    /* renamed from: y */
    public android.os.Message f690y;

    /* renamed from: z */
    public android.graphics.drawable.Drawable f691z;

    public static class RecycleListView extends android.widget.ListView {

        /* renamed from: a0 */
        public final int f692a0;

        /* renamed from: b0 */
        public final int f693b0;

        public RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = p064e.C1495i.f7276s
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                r3 = 0
                r0 = -1
                int r3 = r2.getDimensionPixelOffset(r3, r0)
                r1.f693b0 = r3
                r3 = 1
                int r2 = r2.getDimensionPixelOffset(r3, r0)
                r1.f692a0 = r2
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0199a implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.app.AlertController f694Y;

        public ViewOnClickListenerC0199a(androidx.appcompat.app.AlertController r1) {
                r0 = this;
                r0.f694Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.app.AlertController r0 = r2.f694Y
                android.widget.Button r1 = r0.f680o
                if (r3 != r1) goto Lf
                android.os.Message r1 = r0.f682q
                if (r1 == 0) goto Lf
            La:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L26
            Lf:
                android.widget.Button r1 = r0.f684s
                if (r3 != r1) goto L18
                android.os.Message r1 = r0.f686u
                if (r1 == 0) goto L18
                goto La
            L18:
                android.widget.Button r1 = r0.f688w
                if (r3 != r1) goto L25
                android.os.Message r3 = r0.f690y
                if (r3 == 0) goto L25
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L26
            L25:
                r3 = 0
            L26:
                if (r3 == 0) goto L2b
                r3.sendToTarget()
            L2b:
                androidx.appcompat.app.AlertController r3 = r2.f694Y
                android.os.Handler r0 = r3.f664Q
                r1 = 1
                f.p r3 = r3.f667b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0200b {

        /* renamed from: a */
        public final android.content.Context f695a;

        /* renamed from: b */
        public final android.view.LayoutInflater f696b;

        /* renamed from: c */
        public android.graphics.drawable.Drawable f697c;

        /* renamed from: d */
        public java.lang.CharSequence f698d;

        /* renamed from: e */
        public android.view.View f699e;

        /* renamed from: f */
        public java.lang.CharSequence f700f;

        /* renamed from: g */
        public android.content.DialogInterface.OnClickListener f701g;

        /* renamed from: h */
        public java.lang.CharSequence f702h;

        /* renamed from: i */
        public android.content.DialogInterface.OnClickListener f703i;

        /* renamed from: j */
        public boolean f704j;

        /* renamed from: k */
        public android.content.DialogInterface.OnKeyListener f705k;

        /* renamed from: l */
        public android.widget.ListAdapter f706l;

        /* renamed from: m */
        public android.content.DialogInterface.OnClickListener f707m;

        /* renamed from: n */
        public android.view.View f708n;

        /* renamed from: o */
        public boolean f709o;

        /* renamed from: p */
        public int f710p;

        public C0200b(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f710p = r0
                r1.f695a = r2
                r0 = 1
                r1.f704j = r0
                java.lang.String r0 = "layout_inflater"
                java.lang.Object r2 = r2.getSystemService(r0)
                android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
                r1.f696b = r2
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0201c extends android.os.Handler {

        /* renamed from: a */
        public java.lang.ref.WeakReference<android.content.DialogInterface> f711a;

        public HandlerC0201c(android.content.DialogInterface r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f711a = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = -3
                if (r0 == r1) goto L17
                r1 = -2
                if (r0 == r1) goto L17
                r1 = -1
                if (r0 == r1) goto L17
                r1 = 1
                if (r0 == r1) goto Lf
                goto L28
            Lf:
                java.lang.Object r3 = r3.obj
                android.content.DialogInterface r3 = (android.content.DialogInterface) r3
                r3.dismiss()
                goto L28
            L17:
                java.lang.Object r0 = r3.obj
                android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
                java.lang.ref.WeakReference<android.content.DialogInterface> r1 = r2.f711a
                java.lang.Object r1 = r1.get()
                android.content.DialogInterface r1 = (android.content.DialogInterface) r1
                int r3 = r3.what
                r0.onClick(r1, r3)
            L28:
                return
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0202d extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        public C0202d(android.content.Context r1, int r2, int r3, java.lang.CharSequence[] r4) {
                r0 = this;
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public AlertController(android.content.Context r4, p083f.DialogC1929p r5, android.view.Window r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f679n = r0
            r3.f649B = r0
            r1 = -1
            r3.f656I = r1
            androidx.appcompat.app.AlertController$a r1 = new androidx.appcompat.app.AlertController$a
            r1.<init>(r3)
            r3.f665R = r1
            r3.f666a = r4
            r3.f667b = r5
            r3.f668c = r6
            androidx.appcompat.app.AlertController$c r6 = new androidx.appcompat.app.AlertController$c
            r6.<init>(r5)
            r3.f664Q = r6
            int[] r6 = p064e.C1495i.f7262e
            r1 = 0
            r2 = 2130968619(0x7f04002b, float:1.7545897E38)
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1, r6, r2, r0)
            int r6 = r4.getResourceId(r0, r0)
            r3.f657J = r6
            r6 = 2
            int r6 = r4.getResourceId(r6, r0)
            r3.f658K = r6
            r6 = 4
            int r6 = r4.getResourceId(r6, r0)
            r3.f659L = r6
            r6 = 5
            int r6 = r4.getResourceId(r6, r0)
            r3.f660M = r6
            r6 = 7
            int r6 = r4.getResourceId(r6, r0)
            r3.f661N = r6
            r6 = 3
            int r6 = r4.getResourceId(r6, r0)
            r3.f662O = r6
            r6 = 6
            r1 = 1
            boolean r6 = r4.getBoolean(r6, r1)
            r3.f663P = r6
            int r6 = r4.getDimensionPixelSize(r1, r0)
            r3.f669d = r6
            r4.recycle()
            r5.m4771c(r1)
            return
    }

    /* renamed from: a */
    public static boolean m450a(android.view.View r4) {
            boolean r0 = r4.onCheckIsTextEditor()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4 instanceof android.view.ViewGroup
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
        L14:
            if (r0 <= 0) goto L23
            int r0 = r0 + (-1)
            android.view.View r3 = r4.getChildAt(r0)
            boolean r3 = m450a(r3)
            if (r3 == 0) goto L14
            return r1
        L23:
            return r2
    }

    /* renamed from: c */
    public static void m451c(android.view.View r3, android.view.View r4, android.view.View r5) {
            r0 = 4
            r1 = 0
            if (r4 == 0) goto L11
            r2 = -1
            boolean r2 = r3.canScrollVertically(r2)
            if (r2 == 0) goto Ld
            r2 = 0
            goto Le
        Ld:
            r2 = 4
        Le:
            r4.setVisibility(r2)
        L11:
            if (r5 == 0) goto L1e
            r4 = 1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L1b
            r0 = 0
        L1b:
            r5.setVisibility(r0)
        L1e:
            return
    }

    /* renamed from: b */
    public final void m452b(android.widget.Button r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r1 = 1
            r0.gravity = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.weight = r1
            r3.setLayoutParams(r0)
            return
    }

    /* renamed from: d */
    public final android.view.ViewGroup m453d(android.view.View r3, android.view.View r4) {
            r2 = this;
            if (r3 != 0) goto Lf
            boolean r3 = r4 instanceof android.view.ViewStub
            if (r3 == 0) goto Lc
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r4 = r4.inflate()
        Lc:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            return r4
        Lf:
            if (r4 == 0) goto L1e
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r4)
        L1e:
            boolean r4 = r3 instanceof android.view.ViewStub
            if (r4 == 0) goto L28
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        L28:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
    }

    /* renamed from: e */
    public void m454e(int r1, java.lang.CharSequence r2, android.content.DialogInterface.OnClickListener r3, android.os.Message r4, android.graphics.drawable.Drawable r5) {
            r0 = this;
            r4 = 0
            if (r3 == 0) goto La
            android.os.Handler r5 = r0.f664Q
            android.os.Message r3 = r5.obtainMessage(r1, r3)
            goto Lb
        La:
            r3 = r4
        Lb:
            r5 = -3
            if (r1 == r5) goto L2a
            r5 = -2
            if (r1 == r5) goto L23
            r5 = -1
            if (r1 != r5) goto L1b
            r0.f681p = r2
            r0.f682q = r3
            r0.f683r = r4
            goto L30
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Button does not exist"
            r1.<init>(r2)
            throw r1
        L23:
            r0.f685t = r2
            r0.f686u = r3
            r0.f687v = r4
            goto L30
        L2a:
            r0.f689x = r2
            r0.f690y = r3
            r0.f691z = r4
        L30:
            return
    }
}
