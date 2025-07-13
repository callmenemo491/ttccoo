package androidx.fragment.app;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.f0 */
/* loaded from: classes.dex */
public final class C0380f0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C0380f0> CREATOR = null;

    /* renamed from: Y */
    public java.util.ArrayList<androidx.fragment.app.C0386i0> f2161Y;

    /* renamed from: Z */
    public java.util.ArrayList<java.lang.String> f2162Z;

    /* renamed from: a0 */
    public androidx.fragment.app.C0368b[] f2163a0;

    /* renamed from: b0 */
    public int f2164b0;

    /* renamed from: c0 */
    public java.lang.String f2165c0;

    /* renamed from: d0 */
    public java.util.ArrayList<java.lang.String> f2166d0;

    /* renamed from: e0 */
    public java.util.ArrayList<android.os.Bundle> f2167e0;

    /* renamed from: f0 */
    public java.util.ArrayList<androidx.fragment.app.AbstractC0375d0.l> f2168f0;

    /* renamed from: androidx.fragment.app.f0$a */
    public class a implements android.os.Parcelable.Creator<androidx.fragment.app.C0380f0> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.C0380f0 createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.fragment.app.f0 r0 = new androidx.fragment.app.f0
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.C0380f0[] newArray(int r1) {
                r0 = this;
                androidx.fragment.app.f0[] r1 = new androidx.fragment.app.C0380f0[r1]
                return r1
        }
    }

    static {
            androidx.fragment.app.f0$a r0 = new androidx.fragment.app.f0$a
            r0.<init>()
            androidx.fragment.app.C0380f0.CREATOR = r0
            return
    }

    public C0380f0() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2165c0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2166d0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2167e0 = r0
            return
    }

    public C0380f0(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2165c0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2166d0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2167e0 = r0
            android.os.Parcelable$Creator<androidx.fragment.app.i0> r0 = androidx.fragment.app.C0386i0.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f2161Y = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f2162Z = r0
            android.os.Parcelable$Creator<androidx.fragment.app.b> r0 = androidx.fragment.app.C0368b.CREATOR
            java.lang.Object[] r0 = r2.createTypedArray(r0)
            androidx.fragment.app.b[] r0 = (androidx.fragment.app.C0368b[]) r0
            r1.f2163a0 = r0
            int r0 = r2.readInt()
            r1.f2164b0 = r0
            java.lang.String r0 = r2.readString()
            r1.f2165c0 = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f2166d0 = r0
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f2167e0 = r0
            android.os.Parcelable$Creator<androidx.fragment.app.d0$l> r0 = androidx.fragment.app.AbstractC0375d0.l.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f2168f0 = r2
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
            java.util.ArrayList<androidx.fragment.app.i0> r0 = r1.f2161Y
            r2.writeTypedList(r0)
            java.util.ArrayList<java.lang.String> r0 = r1.f2162Z
            r2.writeStringList(r0)
            androidx.fragment.app.b[] r0 = r1.f2163a0
            r2.writeTypedArray(r0, r3)
            int r3 = r1.f2164b0
            r2.writeInt(r3)
            java.lang.String r3 = r1.f2165c0
            r2.writeString(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f2166d0
            r2.writeStringList(r3)
            java.util.ArrayList<android.os.Bundle> r3 = r1.f2167e0
            r2.writeTypedList(r3)
            java.util.ArrayList<androidx.fragment.app.d0$l> r3 = r1.f2168f0
            r2.writeTypedList(r3)
            return
    }
}
