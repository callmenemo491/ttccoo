package p354u7;

/* renamed from: u7.d */
/* loaded from: classes.dex */
public class C6353d extends android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> {

    /* renamed from: a */
    public static final android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> f24810a = null;

    static {
            u7.d r0 = new u7.d
            r0.<init>()
            p354u7.C6353d.f24810a = r0
            return
    }

    public C6353d() {
            r2 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.String r1 = "drawableAlphaCompat"
            r2.<init>(r0, r1)
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            return
    }

    @Override // android.util.Property
    public java.lang.Integer get(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            int r1 = r1.getAlpha()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @Override // android.util.Property
    public void set(android.graphics.drawable.Drawable r1, java.lang.Integer r2) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setAlpha(r2)
            return
    }
}
