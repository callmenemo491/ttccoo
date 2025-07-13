package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C0210d extends android.widget.BaseAdapter {

    /* renamed from: Y */
    public androidx.appcompat.view.menu.C0211e f801Y;

    /* renamed from: Z */
    public int f802Z;

    /* renamed from: a0 */
    public boolean f803a0;

    /* renamed from: b0 */
    public final boolean f804b0;

    /* renamed from: c0 */
    public final android.view.LayoutInflater f805c0;

    /* renamed from: d0 */
    public final int f806d0;

    public C0210d(androidx.appcompat.view.menu.C0211e r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f802Z = r0
            r1.f804b0 = r4
            r1.f805c0 = r3
            r1.f801Y = r2
            r1.f806d0 = r5
            r1.m496a()
            return
    }

    /* renamed from: a */
    public void m496a() {
            r5 = this;
            androidx.appcompat.view.menu.e r0 = r5.f801Y
            androidx.appcompat.view.menu.g r1 = r0.f829v
            if (r1 == 0) goto L20
            r0.m506i()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r0.f817j
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L20
            java.lang.Object r4 = r0.get(r3)
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0213g) r4
            if (r4 != r1) goto L1d
            r5.f802Z = r3
            return
        L1d:
            int r3 = r3 + 1
            goto L10
        L20:
            r0 = -1
            r5.f802Z = r0
            return
    }

    /* renamed from: b */
    public androidx.appcompat.view.menu.C0213g m497b(int r3) {
            r2 = this;
            boolean r0 = r2.f804b0
            if (r0 == 0) goto Lc
            androidx.appcompat.view.menu.e r0 = r2.f801Y
            r0.m506i()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r0.f817j
            goto L12
        Lc:
            androidx.appcompat.view.menu.e r0 = r2.f801Y
            java.util.ArrayList r0 = r0.m509l()
        L12:
            int r1 = r2.f802Z
            if (r1 < 0) goto L1a
            if (r3 < r1) goto L1a
            int r3 = r3 + 1
        L1a:
            java.lang.Object r3 = r0.get(r3)
            androidx.appcompat.view.menu.g r3 = (androidx.appcompat.view.menu.C0213g) r3
            return r3
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            boolean r0 = r2.f804b0
            if (r0 == 0) goto Lc
            androidx.appcompat.view.menu.e r0 = r2.f801Y
            r0.m506i()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r0.f817j
            goto L12
        Lc:
            androidx.appcompat.view.menu.e r0 = r2.f801Y
            java.util.ArrayList r0 = r0.m509l()
        L12:
            int r1 = r2.f802Z
            int r0 = r0.size()
            if (r1 >= 0) goto L1b
            return r0
        L1b:
            int r0 = r0 + (-1)
            return r0
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            androidx.appcompat.view.menu.g r1 = r0.m497b(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.f805c0
            int r1 = r5.f806d0
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            androidx.appcompat.view.menu.g r8 = r5.m497b(r6)
            int r8 = r8.f840b
            int r1 = r6 + (-1)
            if (r1 < 0) goto L1c
            androidx.appcompat.view.menu.g r1 = r5.m497b(r1)
            int r1 = r1.f840b
            goto L1d
        L1c:
            r1 = r8
        L1d:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            androidx.appcompat.view.menu.e r3 = r5.f801Y
            boolean r3 = r3.mo510m()
            r4 = 1
            if (r3 == 0) goto L2d
            if (r8 == r1) goto L2d
            r8 = 1
            goto L2e
        L2d:
            r8 = 0
        L2e:
            r2.setGroupDividerEnabled(r8)
            r8 = r7
            androidx.appcompat.view.menu.j$a r8 = (androidx.appcompat.view.menu.InterfaceC0216j.a) r8
            boolean r1 = r5.f803a0
            if (r1 == 0) goto L3b
            r2.setForceShowIcon(r4)
        L3b:
            androidx.appcompat.view.menu.g r6 = r5.m497b(r6)
            r8.mo459d(r6, r0)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r0 = this;
            r0.m496a()
            super.notifyDataSetChanged()
            return
    }
}
