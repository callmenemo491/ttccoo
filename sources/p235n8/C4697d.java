package p235n8;

/* renamed from: n8.d */
/* loaded from: classes.dex */
public class C4697d implements androidx.appcompat.view.menu.InterfaceC0215i {

    /* renamed from: Y */
    public p235n8.AbstractC4696c f18763Y;

    /* renamed from: Z */
    public boolean f18764Z;

    /* renamed from: a0 */
    public int f18765a0;

    /* renamed from: n8.d$a */
    public static class a implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<p235n8.C4697d.a> CREATOR = null;

        /* renamed from: Y */
        public int f18766Y;

        /* renamed from: Z */
        public p220m8.C4423g f18767Z;

        /* renamed from: n8.d$a$a, reason: collision with other inner class name */
        public static class C7409a implements android.os.Parcelable.Creator<p235n8.C4697d.a> {
            public C7409a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public p235n8.C4697d.a createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    n8.d$a r0 = new n8.d$a
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public p235n8.C4697d.a[] newArray(int r1) {
                    r0 = this;
                    n8.d$a[] r1 = new p235n8.C4697d.a[r1]
                    return r1
            }
        }

        static {
                n8.d$a$a r0 = new n8.d$a$a
                r0.<init>()
                p235n8.C4697d.a.CREATOR = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public a(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.f18766Y = r0
                java.lang.Class<n8.d$a> r0 = p235n8.C4697d.a.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r2 = r2.readParcelable(r0)
                m8.g r2 = (p220m8.C4423g) r2
                r1.f18767Z = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                int r3 = r1.f18766Y
                r2.writeInt(r3)
                m8.g r3 = r1.f18767Z
                r0 = 0
                r2.writeParcelable(r3, r0)
                return
        }
    }

    public C4697d() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f18764Z = r0
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: a */
    public void mo472a(androidx.appcompat.view.menu.C0211e r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: r */
    public int mo469r() {
            r1 = this;
            int r0 = r1.f18765a0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: s */
    public void mo493s(android.content.Context r1, androidx.appcompat.view.menu.C0211e r2) {
            r0 = this;
            n8.c r1 = r0.f18763Y
            r1.f18761s0 = r2
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: t */
    public void mo485t(android.os.Parcelable r10) {
            r9 = this;
            boolean r0 = r10 instanceof p235n8.C4697d.a
            if (r0 == 0) goto Lb1
            n8.c r0 = r9.f18763Y
            n8.d$a r10 = (p235n8.C4697d.a) r10
            int r1 = r10.f18766Y
            androidx.appcompat.view.menu.e r2 = r0.f18761s0
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L2c
            androidx.appcompat.view.menu.e r5 = r0.f18761s0
            android.view.MenuItem r5 = r5.getItem(r4)
            int r6 = r5.getItemId()
            if (r1 != r6) goto L29
            r0.f18749g0 = r1
            r0.f18750h0 = r4
            r0 = 1
            r5.setChecked(r0)
            goto L2c
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            n8.c r0 = r9.f18763Y
            android.content.Context r0 = r0.getContext()
            m8.g r10 = r10.f18767Z
            android.util.SparseArray r1 = new android.util.SparseArray
            int r2 = r10.size()
            r1.<init>(r2)
            r2 = 0
        L3e:
            int r4 = r10.size()
            if (r2 >= r4) goto Lac
            int r4 = r10.keyAt(r2)
            java.lang.Object r5 = r10.valueAt(r2)
            w7.a$a r5 = (p389w7.C6817a.a) r5
            if (r5 == 0) goto La4
            w7.a r6 = new w7.a
            r6.<init>(r0)
            int r7 = r5.f26548c0
            r6.m13896j(r7)
            int r7 = r5.f26547b0
            r8 = -1
            if (r7 == r8) goto L62
            r6.m13897k(r7)
        L62:
            int r7 = r5.f26544Y
            r6.m13893g(r7)
            int r7 = r5.f26545Z
            r6.m13895i(r7)
            int r7 = r5.f26552g0
            r6.m13894h(r7)
            int r7 = r5.f26554i0
            w7.a$a r8 = r6.f26535f0
            r8.f26554i0 = r7
            r6.m13899m()
            int r7 = r5.f26555j0
            w7.a$a r8 = r6.f26535f0
            r8.f26555j0 = r7
            r6.m13899m()
            int r7 = r5.f26556k0
            w7.a$a r8 = r6.f26535f0
            r8.f26556k0 = r7
            r6.m13899m()
            int r7 = r5.f26557l0
            w7.a$a r8 = r6.f26535f0
            r8.f26557l0 = r7
            r6.m13899m()
            boolean r5 = r5.f26553h0
            r6.setVisible(r5, r3)
            w7.a$a r7 = r6.f26535f0
            r7.f26553h0 = r5
            r1.put(r4, r6)
            int r2 = r2 + 1
            goto L3e
        La4:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "BadgeDrawable's savedState cannot be null"
            r10.<init>(r0)
            throw r10
        Lac:
            n8.c r10 = r9.f18763Y
            r10.setBadgeDrawables(r1)
        Lb1:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: u */
    public boolean mo486u(androidx.appcompat.view.menu.SubMenuC0218l r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: v */
    public void mo487v(boolean r7) {
            r6 = this;
            boolean r0 = r6.f18764Z
            if (r0 == 0) goto L5
            return
        L5:
            if (r7 == 0) goto Le
            n8.c r7 = r6.f18763Y
            r7.m10742a()
            goto L8a
        Le:
            n8.c r7 = r6.f18763Y
            androidx.appcompat.view.menu.e r0 = r7.f18761s0
            if (r0 == 0) goto L8a
            n8.a[] r1 = r7.f18748f0
            if (r1 != 0) goto L19
            goto L8a
        L19:
            int r0 = r0.size()
            n8.a[] r1 = r7.f18748f0
            int r1 = r1.length
            if (r0 == r1) goto L26
            r7.m10742a()
            goto L8a
        L26:
            int r1 = r7.f18749g0
            r2 = 0
            r3 = 0
        L2a:
            if (r3 >= r0) goto L43
            androidx.appcompat.view.menu.e r4 = r7.f18761s0
            android.view.MenuItem r4 = r4.getItem(r3)
            boolean r5 = r4.isChecked()
            if (r5 == 0) goto L40
            int r4 = r4.getItemId()
            r7.f18749g0 = r4
            r7.f18750h0 = r3
        L40:
            int r3 = r3 + 1
            goto L2a
        L43:
            int r3 = r7.f18749g0
            if (r1 == r3) goto L4c
            t1.m r1 = r7.f18743a0
            p333t1.C6108l.m12631a(r7, r1)
        L4c:
            int r1 = r7.f18747e0
            androidx.appcompat.view.menu.e r3 = r7.f18761s0
            java.util.ArrayList r3 = r3.m509l()
            int r3 = r3.size()
            boolean r1 = r7.m10745e(r1, r3)
            r3 = 0
        L5d:
            if (r3 >= r0) goto L8a
            n8.d r4 = r7.f18760r0
            r5 = 1
            r4.f18764Z = r5
            n8.a[] r4 = r7.f18748f0
            r4 = r4[r3]
            int r5 = r7.f18747e0
            r4.setLabelVisibilityMode(r5)
            n8.a[] r4 = r7.f18748f0
            r4 = r4[r3]
            r4.setShifting(r1)
            n8.a[] r4 = r7.f18748f0
            r4 = r4[r3]
            androidx.appcompat.view.menu.e r5 = r7.f18761s0
            android.view.MenuItem r5 = r5.getItem(r3)
            androidx.appcompat.view.menu.g r5 = (androidx.appcompat.view.menu.C0213g) r5
            r4.mo459d(r5, r2)
            n8.d r4 = r7.f18760r0
            r4.f18764Z = r2
            int r3 = r3 + 1
            goto L5d
        L8a:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: w */
    public boolean mo488w() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: x */
    public android.os.Parcelable mo489x() {
            r6 = this;
            n8.d$a r0 = new n8.d$a
            r0.<init>()
            n8.c r1 = r6.f18763Y
            int r1 = r1.getSelectedItemId()
            r0.f18766Y = r1
            n8.c r1 = r6.f18763Y
            android.util.SparseArray r1 = r1.getBadgeDrawables()
            m8.g r2 = new m8.g
            r2.<init>()
            r3 = 0
        L19:
            int r4 = r1.size()
            if (r3 >= r4) goto L3b
            int r4 = r1.keyAt(r3)
            java.lang.Object r5 = r1.valueAt(r3)
            w7.a r5 = (p389w7.C6817a) r5
            if (r5 == 0) goto L33
            w7.a$a r5 = r5.f26535f0
            r2.put(r4, r5)
            int r3 = r3 + 1
            goto L19
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "badgeDrawable cannot be null"
            r0.<init>(r1)
            throw r0
        L3b:
            r0.f18767Z = r2
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: y */
    public boolean mo470y(androidx.appcompat.view.menu.C0211e r1, androidx.appcompat.view.menu.C0213g r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: z */
    public boolean mo471z(androidx.appcompat.view.menu.C0211e r1, androidx.appcompat.view.menu.C0213g r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
