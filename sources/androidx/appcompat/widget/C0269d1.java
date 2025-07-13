package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.d1 */
/* loaded from: classes.dex */
public class C0269d1 {

    /* renamed from: a */
    public final android.content.Context f1262a;

    /* renamed from: b */
    public final android.view.View f1263b;

    /* renamed from: c */
    public final android.widget.TextView f1264c;

    /* renamed from: d */
    public final android.view.WindowManager.LayoutParams f1265d;

    /* renamed from: e */
    public final android.graphics.Rect f1266e;

    /* renamed from: f */
    public final int[] f1267f;

    /* renamed from: g */
    public final int[] f1268g;

    public C0269d1(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r4.f1265d = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.f1266e = r1
            r1 = 2
            int[] r2 = new int[r1]
            r4.f1267f = r2
            int[] r1 = new int[r1]
            r4.f1268g = r1
            r4.f1262a = r5
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r2 = 2131558427(0x7f0d001b, float:1.874217E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r4.f1263b = r1
            r2 = 2131362344(0x7f0a0228, float:1.8344466E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.f1264c = r1
            java.lang.Class<androidx.appcompat.widget.d1> r1 = androidx.appcompat.widget.C0269d1.class
            java.lang.String r1 = r1.getSimpleName()
            r0.setTitle(r1)
            java.lang.String r5 = r5.getPackageName()
            r0.packageName = r5
            r5 = 1002(0x3ea, float:1.404E-42)
            r0.type = r5
            r5 = -2
            r0.width = r5
            r0.height = r5
            r5 = -3
            r0.format = r5
            r5 = 2132017157(0x7f140005, float:1.9672584E38)
            r0.windowAnimations = r5
            r5 = 24
            r0.flags = r5
            return
    }

    /* renamed from: a */
    public void m706a() {
            r2 = this;
            android.view.View r0 = r2.f1263b
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 != 0) goto Le
            return
        Le:
            android.content.Context r0 = r2.f1262a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.View r1 = r2.f1263b
            r0.removeView(r1)
            return
    }
}
