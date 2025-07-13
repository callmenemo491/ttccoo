package p375v9;

/* renamed from: v9.b0 */
/* loaded from: classes.dex */
public final class C6589b0 implements android.os.Parcelable.Creator<p375v9.C6620r> {
    public C6589b0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p375v9.C6620r createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = p270p6.C5368b.m11710t(r7)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L28
            int r3 = r7.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r5 = 1
            if (r4 == r5) goto L23
            r5 = 2
            if (r4 == r5) goto L1e
            p270p6.C5368b.m11709s(r7, r3)
            goto L6
        L1e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r7, r3)
            goto L6
        L23:
            java.lang.String r1 = p270p6.C5368b.m11695e(r7, r3)
            goto L6
        L28:
            p270p6.C5368b.m11699i(r7, r0)
            v9.r r7 = new v9.r
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p375v9.C6620r[] newArray(int r1) {
            r0 = this;
            v9.r[] r1 = new p375v9.C6620r[r1]
            return r1
    }
}
