package androidx.navigation;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.navigation.j */
/* loaded from: classes.dex */
public final class C0515j implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.navigation.C0515j> CREATOR = null;

    /* renamed from: Y */
    public final java.util.UUID f2952Y;

    /* renamed from: Z */
    public final int f2953Z;

    /* renamed from: a0 */
    public final android.os.Bundle f2954a0;

    /* renamed from: b0 */
    public final android.os.Bundle f2955b0;

    /* renamed from: androidx.navigation.j$a */
    public class a implements android.os.Parcelable.Creator<androidx.navigation.C0515j> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public androidx.navigation.C0515j createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.navigation.j r0 = new androidx.navigation.j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public androidx.navigation.C0515j[] newArray(int r1) {
                r0 = this;
                androidx.navigation.j[] r1 = new androidx.navigation.C0515j[r1]
                return r1
        }
    }

    static {
            androidx.navigation.j$a r0 = new androidx.navigation.j$a
            r0.<init>()
            androidx.navigation.C0515j.CREATOR = r0
            return
    }

    public C0515j(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            r1.f2952Y = r0
            int r0 = r2.readInt()
            r1.f2953Z = r0
            java.lang.Class<androidx.navigation.j> r0 = androidx.navigation.C0515j.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r0 = r2.readBundle(r0)
            r1.f2954a0 = r0
            java.lang.Class<androidx.navigation.j> r0 = androidx.navigation.C0515j.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r2 = r2.readBundle(r0)
            r1.f2955b0 = r2
            return
    }

    public C0515j(androidx.navigation.C0514i r2) {
            r1 = this;
            r1.<init>()
            java.util.UUID r0 = r2.f2947c0
            r1.f2952Y = r0
            androidx.navigation.m r0 = r2.f2943Y
            int r0 = r0.f2973a0
            r1.f2953Z = r0
            android.os.Bundle r0 = r2.f2944Z
            r1.f2954a0 = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f2955b0 = r0
            androidx.savedstate.b r2 = r2.f2946b0
            r2.m2157b(r0)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.UUID r2 = r0.f2952Y
            java.lang.String r2 = r2.toString()
            r1.writeString(r2)
            int r2 = r0.f2953Z
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.f2954a0
            r1.writeBundle(r2)
            android.os.Bundle r2 = r0.f2955b0
            r1.writeBundle(r2)
            return
    }
}
