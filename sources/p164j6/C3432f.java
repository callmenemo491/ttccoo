package p164j6;

/* renamed from: j6.f */
/* loaded from: classes.dex */
public final class C3432f implements android.os.Parcelable.Creator<p164j6.C3430d> {
    public C3432f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p164j6.C3430d createFromParcel(android.os.Parcel r2) {
            r1 = this;
            android.os.IBinder r2 = r2.readStrongBinder()
            j6.d r0 = new j6.d
            r0.<init>(r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p164j6.C3430d[] newArray(int r1) {
            r0 = this;
            j6.d[] r1 = new p164j6.C3430d[r1]
            return r1
    }
}
