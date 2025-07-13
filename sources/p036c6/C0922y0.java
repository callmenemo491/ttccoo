package p036c6;

/* renamed from: c6.y0 */
/* loaded from: classes.dex */
public final class C0922y0 implements android.os.Parcelable.Creator<p036c6.C0909s> {
    public C0922y0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0909s createFromParcel(android.os.Parcel r7) {
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
            java.lang.String r1 = p270p6.C5368b.m11695e(r7, r3)
            goto L6
        L28:
            p270p6.C5368b.m11699i(r7, r0)
            c6.s r7 = new c6.s
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0909s[] newArray(int r1) {
            r0 = this;
            c6.s[] r1 = new p036c6.C0909s[r1]
            return r1
    }
}
