package p354u7;

/* renamed from: u7.c */
/* loaded from: classes.dex */
public class C6352c extends android.util.Property<android.view.ViewGroup, java.lang.Float> {

    /* renamed from: a */
    public static final android.util.Property<android.view.ViewGroup, java.lang.Float> f24809a = null;

    static {
            u7.c r0 = new u7.c
            java.lang.String r1 = "childrenAlpha"
            r0.<init>(r1)
            p354u7.C6352c.f24809a = r0
            return
    }

    public C6352c(java.lang.String r2) {
            r1 = this;
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r1.<init>(r0, r2)
            return
    }

    @Override // android.util.Property
    public java.lang.Float get(android.view.ViewGroup r2) {
            r1 = this;
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 2131362425(0x7f0a0279, float:1.834463E38)
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto Le
            goto L14
        Le:
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L14:
            return r2
    }

    @Override // android.util.Property
    public void set(android.view.ViewGroup r4, java.lang.Float r5) {
            r3 = this;
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r1 = 2131362425(0x7f0a0279, float:1.834463E38)
            r4.setTag(r1, r0)
            int r0 = r4.getChildCount()
            r1 = 0
        L17:
            if (r1 >= r0) goto L23
            android.view.View r2 = r4.getChildAt(r1)
            r2.setAlpha(r5)
            int r1 = r1 + 1
            goto L17
        L23:
            return
    }
}
