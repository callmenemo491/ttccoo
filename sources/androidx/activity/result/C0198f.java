package androidx.activity.result;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.f */
/* loaded from: classes.dex */
public final class C0198f implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.C0198f> CREATOR = null;

    /* renamed from: Y */
    public final android.content.IntentSender f644Y;

    /* renamed from: Z */
    public final android.content.Intent f645Z;

    /* renamed from: a0 */
    public final int f646a0;

    /* renamed from: b0 */
    public final int f647b0;

    /* renamed from: androidx.activity.result.f$a */
    public class a implements android.os.Parcelable.Creator<androidx.activity.result.C0198f> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.C0198f createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.activity.result.f r0 = new androidx.activity.result.f
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.C0198f[] newArray(int r1) {
                r0 = this;
                androidx.activity.result.f[] r1 = new androidx.activity.result.C0198f[r1]
                return r1
        }
    }

    static {
            androidx.activity.result.f$a r0 = new androidx.activity.result.f$a
            r0.<init>()
            androidx.activity.result.C0198f.CREATOR = r0
            return
    }

    public C0198f(android.content.IntentSender r1, android.content.Intent r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f644Y = r1
            r0.f645Z = r2
            r0.f646a0 = r3
            r0.f647b0 = r4
            return
    }

    public C0198f(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            r1.f644Y = r0
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.f645Z = r0
            int r0 = r2.readInt()
            r1.f646a0 = r0
            int r2 = r2.readInt()
            r1.f647b0 = r2
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
            android.content.IntentSender r0 = r1.f644Y
            r2.writeParcelable(r0, r3)
            android.content.Intent r0 = r1.f645Z
            r2.writeParcelable(r0, r3)
            int r3 = r1.f646a0
            r2.writeInt(r3)
            int r3 = r1.f647b0
            r2.writeInt(r3)
            return
    }
}
