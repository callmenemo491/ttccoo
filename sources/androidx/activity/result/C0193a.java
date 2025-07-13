package androidx.activity.result;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0193a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.C0193a> CREATOR = null;

    /* renamed from: Y */
    public final int f642Y;

    /* renamed from: Z */
    public final android.content.Intent f643Z;

    /* renamed from: androidx.activity.result.a$a */
    public class a implements android.os.Parcelable.Creator<androidx.activity.result.C0193a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.C0193a createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.activity.result.a r0 = new androidx.activity.result.a
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.C0193a[] newArray(int r1) {
                r0 = this;
                androidx.activity.result.a[] r1 = new androidx.activity.result.C0193a[r1]
                return r1
        }
    }

    static {
            androidx.activity.result.a$a r0 = new androidx.activity.result.a$a
            r0.<init>()
            androidx.activity.result.C0193a.CREATOR = r0
            return
    }

    public C0193a(int r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>()
            r0.f642Y = r1
            r0.f643Z = r2
            return
    }

    public C0193a(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.f642Y = r0
            int r0 = r2.readInt()
            if (r0 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
            java.lang.Object r2 = r0.createFromParcel(r2)
            android.content.Intent r2 = (android.content.Intent) r2
        L19:
            r1.f643Z = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ActivityResult{resultCode="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f642Y
            r2 = -1
            if (r1 == r2) goto L15
            if (r1 == 0) goto L12
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L17
        L12:
            java.lang.String r1 = "RESULT_CANCELED"
            goto L17
        L15:
            java.lang.String r1 = "RESULT_OK"
        L17:
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            android.content.Intent r1 = r3.f643Z
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r0 = r1.f642Y
            r2.writeInt(r0)
            android.content.Intent r0 = r1.f643Z
            if (r0 != 0) goto Lb
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            r2.writeInt(r0)
            android.content.Intent r0 = r1.f643Z
            if (r0 == 0) goto L16
            r0.writeToParcel(r2, r3)
        L16:
            return
    }
}
