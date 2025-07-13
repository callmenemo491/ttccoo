package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public class C0283j {

    /* renamed from: a */
    public final android.widget.CompoundButton f1318a;

    /* renamed from: b */
    public android.content.res.ColorStateList f1319b;

    /* renamed from: c */
    public android.graphics.PorterDuff.Mode f1320c;

    /* renamed from: d */
    public boolean f1321d;

    /* renamed from: e */
    public boolean f1322e;

    /* renamed from: f */
    public boolean f1323f;

    public C0283j(android.widget.CompoundButton r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1319b = r0
            r1.f1320c = r0
            r0 = 0
            r1.f1321d = r0
            r1.f1322e = r0
            r1.f1318a = r2
            return
    }

    /* renamed from: a */
    public void m730a() {
            r2 = this;
            android.widget.CompoundButton r0 = r2.f1318a
            android.graphics.drawable.Drawable r0 = p280q0.C5536c.m11804a(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.f1321d
            if (r1 != 0) goto L10
            boolean r1 = r2.f1322e
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.f1321d
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.f1319b
            r0.setTintList(r1)
        L21:
            boolean r1 = r2.f1322e
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.f1320c
            r0.setTintMode(r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CompoundButton r1 = r2.f1318a
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CompoundButton r1 = r2.f1318a
            r1.setButtonDrawable(r0)
        L3e:
            return
    }

    /* renamed from: b */
    public void m731b(android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1318a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p064e.C1495i.f7269l
            r8 = 0
            androidx.appcompat.widget.y0 r0 = androidx.appcompat.widget.C0314y0.m848r(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1318a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1501b
            r7 = 0
            r4 = r10
            r6 = r11
            p227n0.C4661t.m10545u(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.m864p(r10)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L36
            int r11 = r0.m861m(r10, r8)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L36
            android.widget.CompoundButton r1 = r9.f1318a     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L63
            android.content.Context r2 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L63
            android.graphics.drawable.Drawable r11 = p102g.C2199a.m5784b(r2, r11)     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L63
            r1.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L63
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 != 0) goto L52
            boolean r10 = r0.m864p(r8)     // Catch: java.lang.Throwable -> L63
            if (r10 == 0) goto L52
            int r10 = r0.m861m(r8, r8)     // Catch: java.lang.Throwable -> L63
            if (r10 == 0) goto L52
            android.widget.CompoundButton r11 = r9.f1318a     // Catch: java.lang.Throwable -> L63
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L63
            android.graphics.drawable.Drawable r10 = p102g.C2199a.m5784b(r1, r10)     // Catch: java.lang.Throwable -> L63
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L63
        L52:
            r10 = 2
            boolean r11 = r0.m864p(r10)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L65
            android.widget.CompoundButton r11 = r9.f1318a     // Catch: java.lang.Throwable -> L63
            android.content.res.ColorStateList r10 = r0.m851c(r10)     // Catch: java.lang.Throwable -> L63
            r11.setButtonTintList(r10)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r10 = move-exception
            goto L81
        L65:
            r10 = 3
            boolean r11 = r0.m864p(r10)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L7b
            android.widget.CompoundButton r11 = r9.f1318a     // Catch: java.lang.Throwable -> L63
            r1 = -1
            int r10 = r0.m858j(r10, r1)     // Catch: java.lang.Throwable -> L63
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0271e0.m710d(r10, r1)     // Catch: java.lang.Throwable -> L63
            r11.setButtonTintMode(r10)     // Catch: java.lang.Throwable -> L63
        L7b:
            android.content.res.TypedArray r10 = r0.f1501b
            r10.recycle()
            return
        L81:
            android.content.res.TypedArray r11 = r0.f1501b
            r11.recycle()
            throw r10
    }
}
