package androidx.fragment.app;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.i0 */
/* loaded from: classes.dex */
public final class C0386i0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C0386i0> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f2186Y;

    /* renamed from: Z */
    public final java.lang.String f2187Z;

    /* renamed from: a0 */
    public final boolean f2188a0;

    /* renamed from: b0 */
    public final int f2189b0;

    /* renamed from: c0 */
    public final int f2190c0;

    /* renamed from: d0 */
    public final java.lang.String f2191d0;

    /* renamed from: e0 */
    public final boolean f2192e0;

    /* renamed from: f0 */
    public final boolean f2193f0;

    /* renamed from: g0 */
    public final boolean f2194g0;

    /* renamed from: h0 */
    public final android.os.Bundle f2195h0;

    /* renamed from: i0 */
    public final boolean f2196i0;

    /* renamed from: j0 */
    public final int f2197j0;

    /* renamed from: k0 */
    public android.os.Bundle f2198k0;

    /* renamed from: androidx.fragment.app.i0$a */
    public class a implements android.os.Parcelable.Creator<androidx.fragment.app.C0386i0> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.C0386i0 createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.fragment.app.i0 r0 = new androidx.fragment.app.i0
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.C0386i0[] newArray(int r1) {
                r0 = this;
                androidx.fragment.app.i0[] r1 = new androidx.fragment.app.C0386i0[r1]
                return r1
        }
    }

    static {
            androidx.fragment.app.i0$a r0 = new androidx.fragment.app.i0$a
            r0.<init>()
            androidx.fragment.app.C0386i0.CREATOR = r0
            return
    }

    public C0386i0(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.f2186Y = r0
            java.lang.String r0 = r4.readString()
            r3.f2187Z = r0
            int r0 = r4.readInt()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            r3.f2188a0 = r0
            int r0 = r4.readInt()
            r3.f2189b0 = r0
            int r0 = r4.readInt()
            r3.f2190c0 = r0
            java.lang.String r0 = r4.readString()
            r3.f2191d0 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            r3.f2192e0 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L41
            r0 = 1
            goto L42
        L41:
            r0 = 0
        L42:
            r3.f2193f0 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L4c
            r0 = 1
            goto L4d
        L4c:
            r0 = 0
        L4d:
            r3.f2194g0 = r0
            android.os.Bundle r0 = r4.readBundle()
            r3.f2195h0 = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            r1 = 0
        L5d:
            r3.f2196i0 = r1
            android.os.Bundle r0 = r4.readBundle()
            r3.f2198k0 = r0
            int r4 = r4.readInt()
            r3.f2197j0 = r4
            return
    }

    public C0386i0(androidx.fragment.app.ComponentCallbacksC0395n r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.f2186Y = r0
            java.lang.String r0 = r2.f2281c0
            r1.f2187Z = r0
            boolean r0 = r2.f2289k0
            r1.f2188a0 = r0
            int r0 = r2.f2298t0
            r1.f2189b0 = r0
            int r0 = r2.f2299u0
            r1.f2190c0 = r0
            java.lang.String r0 = r2.f2300v0
            r1.f2191d0 = r0
            boolean r0 = r2.f2303y0
            r1.f2192e0 = r0
            boolean r0 = r2.f2288j0
            r1.f2193f0 = r0
            boolean r0 = r2.f2302x0
            r1.f2194g0 = r0
            android.os.Bundle r0 = r2.f2282d0
            r1.f2195h0 = r0
            boolean r0 = r2.f2301w0
            r1.f2196i0 = r0
            androidx.lifecycle.o$c r2 = r2.f2268K0
            int r2 = r2.ordinal()
            r1.f2197j0 = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentState{"
            r0.append(r1)
            java.lang.String r1 = r2.f2186Y
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r2.f2187Z
            r0.append(r1)
            java.lang.String r1 = ")}:"
            r0.append(r1)
            boolean r1 = r2.f2188a0
            if (r1 == 0) goto L29
            java.lang.String r1 = " fromLayout"
            r0.append(r1)
        L29:
            int r1 = r2.f2190c0
            if (r1 == 0) goto L3b
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.f2190c0
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L3b:
            java.lang.String r1 = r2.f2191d0
            if (r1 == 0) goto L4f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4f
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.f2191d0
            r0.append(r1)
        L4f:
            boolean r1 = r2.f2192e0
            if (r1 == 0) goto L58
            java.lang.String r1 = " retainInstance"
            r0.append(r1)
        L58:
            boolean r1 = r2.f2193f0
            if (r1 == 0) goto L61
            java.lang.String r1 = " removing"
            r0.append(r1)
        L61:
            boolean r1 = r2.f2194g0
            if (r1 == 0) goto L6a
            java.lang.String r1 = " detached"
            r0.append(r1)
        L6a:
            boolean r1 = r2.f2196i0
            if (r1 == 0) goto L73
            java.lang.String r1 = " hidden"
            r0.append(r1)
        L73:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f2186Y
            r1.writeString(r2)
            java.lang.String r2 = r0.f2187Z
            r1.writeString(r2)
            boolean r2 = r0.f2188a0
            r1.writeInt(r2)
            int r2 = r0.f2189b0
            r1.writeInt(r2)
            int r2 = r0.f2190c0
            r1.writeInt(r2)
            java.lang.String r2 = r0.f2191d0
            r1.writeString(r2)
            boolean r2 = r0.f2192e0
            r1.writeInt(r2)
            boolean r2 = r0.f2193f0
            r1.writeInt(r2)
            boolean r2 = r0.f2194g0
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.f2195h0
            r1.writeBundle(r2)
            boolean r2 = r0.f2196i0
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.f2198k0
            r1.writeBundle(r2)
            int r2 = r0.f2197j0
            r1.writeInt(r2)
            return
    }
}
