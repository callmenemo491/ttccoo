package p036c6;

/* renamed from: c6.w0 */
/* loaded from: classes.dex */
public final class C0918w0 implements android.os.Parcelable.Creator<p036c6.C0905q> {
    public C0918w0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0905q createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = p270p6.C5368b.m11710t(r7)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L2c
            int r3 = r7.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r5 = 2
            if (r4 == r5) goto L23
            r5 = 3
            if (r4 == r5) goto L1e
            p270p6.C5368b.m11709s(r7, r3)
            goto L6
        L1e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r7, r3)
            goto L6
        L23:
            android.os.Parcelable$Creator<c6.j> r1 = p036c6.C0891j.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r7, r3, r1)
            c6.j r1 = (p036c6.C0891j) r1
            goto L6
        L2c:
            p270p6.C5368b.m11699i(r7, r0)
            c6.q r7 = new c6.q
            org.json.JSONObject r0 = p123h6.C2487a.m6362a(r2)
            r7.<init>(r1, r0)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0905q[] newArray(int r1) {
            r0 = this;
            c6.q[] r1 = new p036c6.C0905q[r1]
            return r1
    }
}
