package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC0596j0 extends androidx.recyclerview.widget.RecyclerView.AbstractC0554j {

    /* renamed from: g */
    public boolean f3452g;

    public AbstractC0596j0() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f3452g = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0554j
    /* renamed from: a */
    public boolean mo1829a(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r8, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r9, androidx.recyclerview.widget.RecyclerView.AbstractC0554j.c r10, androidx.recyclerview.widget.RecyclerView.AbstractC0554j.c r11) {
            r7 = this;
            int r3 = r10.f3237a
            int r4 = r10.f3238b
            boolean r0 = r9.m1805v()
            if (r0 == 0) goto L11
            int r11 = r10.f3237a
            int r10 = r10.f3238b
            r6 = r10
            r5 = r11
            goto L17
        L11:
            int r10 = r11.f3237a
            int r11 = r11.f3238b
            r5 = r10
            r6 = r11
        L17:
            r0 = r7
            r1 = r8
            r2 = r9
            boolean r8 = r0.mo2070l(r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: k */
    public abstract boolean mo2069k(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1);

    /* renamed from: l */
    public abstract boolean mo2070l(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, int r3, int r4, int r5, int r6);

    /* renamed from: m */
    public abstract boolean mo2071m(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, int r2, int r3, int r4, int r5);

    /* renamed from: n */
    public abstract boolean mo2072n(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1);
}
