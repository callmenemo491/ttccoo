package androidx.fragment.app;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0368b implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C0368b> CREATOR = null;

    /* renamed from: Y */
    public final int[] f2039Y;

    /* renamed from: Z */
    public final java.util.ArrayList<java.lang.String> f2040Z;

    /* renamed from: a0 */
    public final int[] f2041a0;

    /* renamed from: b0 */
    public final int[] f2042b0;

    /* renamed from: c0 */
    public final int f2043c0;

    /* renamed from: d0 */
    public final java.lang.String f2044d0;

    /* renamed from: e0 */
    public final int f2045e0;

    /* renamed from: f0 */
    public final int f2046f0;

    /* renamed from: g0 */
    public final java.lang.CharSequence f2047g0;

    /* renamed from: h0 */
    public final int f2048h0;

    /* renamed from: i0 */
    public final java.lang.CharSequence f2049i0;

    /* renamed from: j0 */
    public final java.util.ArrayList<java.lang.String> f2050j0;

    /* renamed from: k0 */
    public final java.util.ArrayList<java.lang.String> f2051k0;

    /* renamed from: l0 */
    public final boolean f2052l0;

    /* renamed from: androidx.fragment.app.b$a */
    public class a implements android.os.Parcelable.Creator<androidx.fragment.app.C0368b> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.C0368b createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.fragment.app.b r0 = new androidx.fragment.app.b
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.C0368b[] newArray(int r1) {
                r0 = this;
                androidx.fragment.app.b[] r1 = new androidx.fragment.app.C0368b[r1]
                return r1
        }
    }

    static {
            androidx.fragment.app.b$a r0 = new androidx.fragment.app.b$a
            r0.<init>()
            androidx.fragment.app.C0368b.CREATOR = r0
            return
    }

    public C0368b(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = r2.createIntArray()
            r1.f2039Y = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f2040Z = r0
            int[] r0 = r2.createIntArray()
            r1.f2041a0 = r0
            int[] r0 = r2.createIntArray()
            r1.f2042b0 = r0
            int r0 = r2.readInt()
            r1.f2043c0 = r0
            java.lang.String r0 = r2.readString()
            r1.f2044d0 = r0
            int r0 = r2.readInt()
            r1.f2045e0 = r0
            int r0 = r2.readInt()
            r1.f2046f0 = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.f2047g0 = r0
            int r0 = r2.readInt()
            r1.f2048h0 = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.f2049i0 = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f2050j0 = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f2051k0 = r0
            int r2 = r2.readInt()
            if (r2 == 0) goto L61
            r2 = 1
            goto L62
        L61:
            r2 = 0
        L62:
            r1.f2052l0 = r2
            return
    }

    public C0368b(androidx.fragment.app.C0365a r8) {
            r7 = this;
            r7.<init>()
            java.util.ArrayList<androidx.fragment.app.m0$a> r0 = r8.f2233a
            int r0 = r0.size()
            int r1 = r0 * 5
            int[] r1 = new int[r1]
            r7.f2039Y = r1
            boolean r1 = r8.f2239g
            if (r1 == 0) goto L9e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r7.f2040Z = r1
            int[] r1 = new int[r0]
            r7.f2041a0 = r1
            int[] r1 = new int[r0]
            r7.f2042b0 = r1
            r1 = 0
            r2 = 0
        L24:
            if (r1 >= r0) goto L75
            java.util.ArrayList<androidx.fragment.app.m0$a> r3 = r8.f2233a
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.m0$a r3 = (androidx.fragment.app.AbstractC0394m0.a) r3
            int[] r4 = r7.f2039Y
            int r5 = r2 + 1
            int r6 = r3.f2249a
            r4[r2] = r6
            java.util.ArrayList<java.lang.String> r2 = r7.f2040Z
            androidx.fragment.app.n r4 = r3.f2250b
            if (r4 == 0) goto L3f
            java.lang.String r4 = r4.f2281c0
            goto L40
        L3f:
            r4 = 0
        L40:
            r2.add(r4)
            int[] r2 = r7.f2039Y
            int r4 = r5 + 1
            int r6 = r3.f2251c
            r2[r5] = r6
            int r5 = r4 + 1
            int r6 = r3.f2252d
            r2[r4] = r6
            int r4 = r5 + 1
            int r6 = r3.f2253e
            r2[r5] = r6
            int r5 = r4 + 1
            int r6 = r3.f2254f
            r2[r4] = r6
            int[] r2 = r7.f2041a0
            androidx.lifecycle.o$c r4 = r3.f2255g
            int r4 = r4.ordinal()
            r2[r1] = r4
            int[] r2 = r7.f2042b0
            androidx.lifecycle.o$c r3 = r3.f2256h
            int r3 = r3.ordinal()
            r2[r1] = r3
            int r1 = r1 + 1
            r2 = r5
            goto L24
        L75:
            int r0 = r8.f2238f
            r7.f2043c0 = r0
            java.lang.String r0 = r8.f2241i
            r7.f2044d0 = r0
            int r0 = r8.f2032s
            r7.f2045e0 = r0
            int r0 = r8.f2242j
            r7.f2046f0 = r0
            java.lang.CharSequence r0 = r8.f2243k
            r7.f2047g0 = r0
            int r0 = r8.f2244l
            r7.f2048h0 = r0
            java.lang.CharSequence r0 = r8.f2245m
            r7.f2049i0 = r0
            java.util.ArrayList<java.lang.String> r0 = r8.f2246n
            r7.f2050j0 = r0
            java.util.ArrayList<java.lang.String> r0 = r8.f2247o
            r7.f2051k0 = r0
            boolean r8 = r8.f2248p
            r7.f2052l0 = r8
            return
        L9e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not on back stack"
            r8.<init>(r0)
            throw r8
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
            int[] r3 = r1.f2039Y
            r2.writeIntArray(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f2040Z
            r2.writeStringList(r3)
            int[] r3 = r1.f2041a0
            r2.writeIntArray(r3)
            int[] r3 = r1.f2042b0
            r2.writeIntArray(r3)
            int r3 = r1.f2043c0
            r2.writeInt(r3)
            java.lang.String r3 = r1.f2044d0
            r2.writeString(r3)
            int r3 = r1.f2045e0
            r2.writeInt(r3)
            int r3 = r1.f2046f0
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.f2047g0
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.f2048h0
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.f2049i0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.f2050j0
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f2051k0
            r2.writeStringList(r3)
            boolean r3 = r1.f2052l0
            r2.writeInt(r3)
            return
    }
}
