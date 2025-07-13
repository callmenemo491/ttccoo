package p367v1;

/* renamed from: v1.d */
/* loaded from: classes.dex */
public class C6490d extends p367v1.AbstractC6489c {

    /* renamed from: d */
    public final android.util.SparseIntArray f25167d;

    /* renamed from: e */
    public final android.os.Parcel f25168e;

    /* renamed from: f */
    public final int f25169f;

    /* renamed from: g */
    public final int f25170g;

    /* renamed from: h */
    public final java.lang.String f25171h;

    /* renamed from: i */
    public int f25172i;

    /* renamed from: j */
    public int f25173j;

    /* renamed from: k */
    public int f25174k;

    public C6490d(android.os.Parcel r9) {
            r8 = this;
            int r2 = r9.dataPosition()
            int r3 = r9.dataSize()
            s.a r5 = new s.a
            r5.<init>()
            s.a r6 = new s.a
            r6.<init>()
            s.a r7 = new s.a
            r7.<init>()
            java.lang.String r4 = ""
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public C6490d(android.os.Parcel r1, int r2, int r3, java.lang.String r4, p319s.C5934a<java.lang.String, java.lang.reflect.Method> r5, p319s.C5934a<java.lang.String, java.lang.reflect.Method> r6, p319s.C5934a<java.lang.String, java.lang.Class> r7) {
            r0 = this;
            r0.<init>(r5, r6, r7)
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            r0.f25167d = r5
            r5 = -1
            r0.f25172i = r5
            r6 = 0
            r0.f25173j = r6
            r0.f25174k = r5
            r0.f25168e = r1
            r0.f25169f = r2
            r0.f25170g = r3
            r0.f25173j = r2
            r0.f25171h = r4
            return
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: a */
    public void mo13183a() {
            r4 = this;
            int r0 = r4.f25172i
            if (r0 < 0) goto L21
            android.util.SparseIntArray r1 = r4.f25167d
            int r0 = r1.get(r0)
            android.os.Parcel r1 = r4.f25168e
            int r1 = r1.dataPosition()
            int r2 = r1 - r0
            android.os.Parcel r3 = r4.f25168e
            r3.setDataPosition(r0)
            android.os.Parcel r0 = r4.f25168e
            r0.writeInt(r2)
            android.os.Parcel r0 = r4.f25168e
            r0.setDataPosition(r1)
        L21:
            return
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: b */
    public p367v1.AbstractC6489c mo13184b() {
            r9 = this;
            v1.d r8 = new v1.d
            android.os.Parcel r1 = r9.f25168e
            int r2 = r1.dataPosition()
            int r0 = r9.f25173j
            int r3 = r9.f25169f
            if (r0 != r3) goto L10
            int r0 = r9.f25170g
        L10:
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r9.f25171h
            java.lang.String r5 = "  "
            java.lang.String r4 = p346u.C6269n.m12888a(r0, r4, r5)
            s.a<java.lang.String, java.lang.reflect.Method> r5 = r9.f25164a
            s.a<java.lang.String, java.lang.reflect.Method> r6 = r9.f25165b
            s.a<java.lang.String, java.lang.Class> r7 = r9.f25166c
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: f */
    public boolean mo13188f() {
            r1 = this;
            android.os.Parcel r0 = r1.f25168e
            int r0 = r0.readInt()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: g */
    public byte[] mo13189g() {
            r2 = this;
            android.os.Parcel r0 = r2.f25168e
            int r0 = r0.readInt()
            if (r0 >= 0) goto La
            r0 = 0
            return r0
        La:
            byte[] r0 = new byte[r0]
            android.os.Parcel r1 = r2.f25168e
            r1.readByteArray(r0)
            return r0
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: h */
    public java.lang.CharSequence mo13190h() {
            r2 = this;
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            android.os.Parcel r1 = r2.f25168e
            java.lang.Object r0 = r0.createFromParcel(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: i */
    public boolean mo13191i(int r5) {
            r4 = this;
        L0:
            int r0 = r4.f25173j
            int r1 = r4.f25170g
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L37
            int r0 = r4.f25174k
            if (r0 != r5) goto Ld
            return r2
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L1c
            return r3
        L1c:
            android.os.Parcel r0 = r4.f25168e
            int r1 = r4.f25173j
            r0.setDataPosition(r1)
            android.os.Parcel r0 = r4.f25168e
            int r0 = r0.readInt()
            android.os.Parcel r1 = r4.f25168e
            int r1 = r1.readInt()
            r4.f25174k = r1
            int r1 = r4.f25173j
            int r1 = r1 + r0
            r4.f25173j = r1
            goto L0
        L37:
            int r0 = r4.f25174k
            if (r0 != r5) goto L3c
            goto L3d
        L3c:
            r2 = 0
        L3d:
            return r2
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: j */
    public int mo13192j() {
            r1 = this;
            android.os.Parcel r0 = r1.f25168e
            int r0 = r0.readInt()
            return r0
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: l */
    public <T extends android.os.Parcelable> T mo13194l() {
            r2 = this;
            android.os.Parcel r0 = r2.f25168e
            java.lang.Class<v1.d> r1 = p367v1.C6490d.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r0 = r0.readParcelable(r1)
            return r0
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: n */
    public java.lang.String mo13196n() {
            r1 = this;
            android.os.Parcel r0 = r1.f25168e
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: p */
    public void mo13198p(int r3) {
            r2 = this;
            r2.mo13183a()
            r2.f25172i = r3
            android.util.SparseIntArray r0 = r2.f25167d
            android.os.Parcel r1 = r2.f25168e
            int r1 = r1.dataPosition()
            r0.put(r3, r1)
            android.os.Parcel r0 = r2.f25168e
            r1 = 0
            r0.writeInt(r1)
            android.os.Parcel r0 = r2.f25168e
            r0.writeInt(r3)
            return
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: q */
    public void mo13199q(boolean r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f25168e
            r0.writeInt(r2)
            return
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: r */
    public void mo13200r(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto Le
            android.os.Parcel r0 = r2.f25168e
            int r1 = r3.length
            r0.writeInt(r1)
            android.os.Parcel r0 = r2.f25168e
            r0.writeByteArray(r3)
            goto L14
        Le:
            android.os.Parcel r3 = r2.f25168e
            r0 = -1
            r3.writeInt(r0)
        L14:
            return
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: s */
    public void mo13201s(java.lang.CharSequence r3) {
            r2 = this;
            android.os.Parcel r0 = r2.f25168e
            r1 = 0
            android.text.TextUtils.writeToParcel(r3, r0, r1)
            return
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: t */
    public void mo13202t(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f25168e
            r0.writeInt(r2)
            return
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: u */
    public void mo13203u(android.os.Parcelable r3) {
            r2 = this;
            android.os.Parcel r0 = r2.f25168e
            r1 = 0
            r0.writeParcelable(r3, r1)
            return
    }

    @Override // p367v1.AbstractC6489c
    /* renamed from: v */
    public void mo13204v(java.lang.String r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f25168e
            r0.writeString(r2)
            return
    }
}
